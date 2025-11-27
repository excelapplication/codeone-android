package WMS.example.WMS.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.WMS.R;

import java.text.Format;
import java.util.List;
import java.util.Locale;

import WMS.example.WMS.ui.model.WmsStorageSummary;

public class WmsStorageSumAdapter  extends RecyclerView.Adapter<WmsStorageSumAdapter.ViewHolder> {
    List<WmsStorageSummary> wmsStorageSummarie;
    public WmsStorageSumAdapter(List<WmsStorageSummary> wmsStorageSummary) {
        this.wmsStorageSummarie=wmsStorageSummary;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wms_storage, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WmsStorageSummary bin = wmsStorageSummarie.get(position);

        holder.tvSbCode.setText("Bay code: " + bin.getSb_code());
        holder.tvTotalCapacity.setText("Total Capacity: " + format(bin.getTot_capacity()));
        holder.tvUsedCapacity.setText("Used Capacity: " + format(bin.getUsed_capacity()));
        holder.tvRemainingCapacity.setText("Remaining Capacity: " + format(bin.getRemaining_capacity()));
        holder.tvPercFill.setText("Filled: " + bin.getPerc_fill() + "%");
        holder.tvPercEmpty.setText("Empty: " + bin.getPerc_empty() + "%");
    }

    @Override
    public int getItemCount() {
        return wmsStorageSummarie.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvSbCode, tvTotalCapacity, tvUsedCapacity, tvRemainingCapacity, tvPercFill, tvPercEmpty;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvSbCode = itemView.findViewById(R.id.tvSbCode);
            tvTotalCapacity = itemView.findViewById(R.id.tvTotalCapacity);
            tvUsedCapacity = itemView.findViewById(R.id.tvUsedCapacity);
            tvRemainingCapacity = itemView.findViewById(R.id.tvRemainingCapacity);
            tvPercFill = itemView.findViewById(R.id.tvPercFill);
            tvPercEmpty = itemView.findViewById(R.id.tvPercEmpty);
        }
    }
    private String format(String value) {
        if (value == null || value.trim().isEmpty()) {
            return "0"; // or "N/A" depending on your UI
        }
        try {
            double parsed = Double.parseDouble(value.trim());
            return String.format(Locale.US, "%,d", (long) parsed); // cast to long to remove decimals
        } catch (NumberFormatException e) {
            return value; // fallback
        }
    }




}
