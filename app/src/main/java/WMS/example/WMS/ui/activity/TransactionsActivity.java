package WMS.example.WMS.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.codeone.wms.R;

public class TransactionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);
        try {
            RecyclerView recyclerView = findViewById(R.id.recycler_view);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
