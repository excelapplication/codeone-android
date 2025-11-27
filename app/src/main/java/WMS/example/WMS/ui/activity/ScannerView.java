package WMS.example.WMS.ui.activity;

import android.Manifest;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ExperimentalGetImage;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScannerView extends AppCompatActivity {

    private PreviewView previewView;
    private ExecutorService cameraExecutor;
    private boolean scanned = false;
    private String tranType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Fullscreen UI flags
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );

        FrameLayout container = new FrameLayout(this);

        // PreviewView setup
        previewView = new PreviewView(this);
        previewView.setLayoutParams(new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));
        container.addView(previewView);

        // Scanning line setup
        View scanLine = new View(this);
        scanLine.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, 6
        ));
        scanLine.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_red_light));
        container.addView(scanLine);

        // Animate scan line
        ObjectAnimator animator = ObjectAnimator.ofFloat(scanLine, "translationY", 0f, 1000f);
        animator.setDuration(2000);
        animator.setRepeatCount(ObjectAnimator.INFINITE);
        animator.setRepeatMode(ObjectAnimator.REVERSE);
        animator.start();

        setContentView(container);

        tranType = getIntent().getStringExtra("tran_type");
        cameraExecutor = Executors.newSingleThreadExecutor();

        Dexter.withContext(this)
                .withPermission(Manifest.permission.CAMERA)
                .withListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse response) {
                        startCamera();
                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse response) {
                        Toast.makeText(ScannerView.this, "Camera permission denied", Toast.LENGTH_SHORT).show();
                        finish();
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
                        token.continuePermissionRequest();
                    }
                }).check();
    }

    private void startCamera() {
        ListenableFuture<ProcessCameraProvider> cameraProviderFuture =
                ProcessCameraProvider.getInstance(this);

        cameraProviderFuture.addListener(() -> {
            try {
                ProcessCameraProvider cameraProvider = cameraProviderFuture.get();
                bindCameraUseCases(cameraProvider);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, ContextCompat.getMainExecutor(this));
    }

    @OptIn(markerClass = ExperimentalGetImage.class)
    private void bindCameraUseCases(@NonNull ProcessCameraProvider cameraProvider) {
        // Preview use case
        Preview preview = new Preview.Builder().build();
        preview.setSurfaceProvider(previewView.getSurfaceProvider());

        // ImageAnalysis for barcode scanning
        ImageAnalysis imageAnalysis = new ImageAnalysis.Builder()
                .setTargetResolution(new Size(1280, 720))
                .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
                .build();

        BarcodeScanner scanner = BarcodeScanning.getClient();

        imageAnalysis.setAnalyzer(cameraExecutor, imageProxy -> {
            if (scanned) {
                imageProxy.close();
                return;
            }

            if (imageProxy.getImage() != null) {
                InputImage image = InputImage.fromMediaImage(
                        imageProxy.getImage(), imageProxy.getImageInfo().getRotationDegrees());

                scanner.process(image)
                        .addOnSuccessListener(barcodes -> {
                            for (Barcode barcode : barcodes) {
                                if (!scanned) {
                                    scanned = true;
                                    handleScannedData(barcode.getRawValue());
                                }
                            }
                        })
                        .addOnFailureListener(Throwable::printStackTrace)
                        .addOnCompleteListener(task -> imageProxy.close());
            } else {
                imageProxy.close();
            }
        });

        // Camera selector
        CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;

        cameraProvider.unbindAll();
        cameraProvider.bindToLifecycle(
                this, cameraSelector, preview, imageAnalysis
        );
    }

    private void handleScannedData(String scannedData) {
        runOnUiThread(() -> {
            Toast.makeText(this, "Scanned: " + scannedData, Toast.LENGTH_SHORT).show();

            if ("03".equals(tranType)) {
                TransferDetailActivity.scantext.setText(scannedData);
                TransferDetailActivity.bin_code_layout.setVisibility(View.VISIBLE);
                TransferDetailActivity.confirm_layout.setVisibility(View.VISIBLE);
            } else {
                ProductDetailsActivity.scantext.setText(scannedData);
                ProductDetailsActivity.bin_code_layout.setVisibility(View.VISIBLE);
                ProductDetailsActivity.confirm_layout.setVisibility(View.VISIBLE);
            }

            previewView.postDelayed(this::finish, 600);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (cameraExecutor != null) {
            cameraExecutor.shutdown();
        }
    }
}
