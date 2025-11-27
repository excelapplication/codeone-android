package WMS.example.WMS;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Window;
import android.widget.TextView;
import android.widget.VideoView;

public class ContextApplication extends Application {

    private static Application application;

    public static Context getContext() {
        return application.getApplicationContext();
    }


//    public static Dialog getDialog(Context context, String message, String path) {
//        VideoView videoView;
//        Dialog dialog = new Dialog(context);
//        try {
//            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//            dialog.setContentView(R.layout.custom_dialog);
//            dialog.setCancelable(false);
//            TextView textView = dialog.findViewById(R.id.message);
//            if (message != null)
//                textView.setText(message);
//            videoView = dialog.findViewById(R.id.VideoView);
//            Uri uri = Uri.parse(path);
//            videoView.setVideoURI(uri);
//            final VideoView finalVideoView = videoView;
//            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//                public void onPrepared(MediaPlayer mp) {
//                    finalVideoView.start();
//                    finalVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        @Override
//                        public void onCompletion(MediaPlayer mediaPlayer) {
//                            finalVideoView.resume();
//                        }
//                    });
//                }
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return dialog;
//    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

}