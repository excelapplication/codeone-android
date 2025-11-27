package WMS.example.WMS.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.WMS.R;

import java.util.ArrayList;
import java.util.List;

import WMS.example.WMS.ui.model.PickslipBean;
import WMS.example.WMS.util.MedicoResources;
import WMS.example.WMS.util.RetrofitUtil;

public class PackingListAdapter extends RecyclerView.Adapter<PackingListAdapter.ViewHolder> {

    private List<PickslipBean> itemList;
    private Context context;

    public PackingListAdapter(List<PickslipBean> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tranHdrNo,transporterName;
        CheckBox checkBox;

        public ViewHolder(View view) {
            super(view);
            tranHdrNo = view.findViewById(R.id.tvTranHdrNo);
            checkBox = view.findViewById(R.id.checkboxSelect);
            transporterName = view.findViewById(R.id.tvTransporterName);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_packing_list, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(PackingListAdapter.ViewHolder holder, int position) {
        PickslipBean item = itemList.get(position);

        // Set invoice number
        holder.tranHdrNo.setText(item.getSd_tran_hdr_no());

        // Set transporter name with camel case
        holder.transporterName.setText(MedicoResources.toCamelCase(item.getDsp_transporter()));

        // Checkbox logic
        holder.checkBox.setChecked(item.isSelected());

        holder.checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            item.setSelected(isChecked);
        });

        holder.itemView.setOnClickListener(v -> {
            boolean newState = !item.isSelected();
            item.setSelected(newState);
            holder.checkBox.setChecked(newState);
        });
    }


    @Override
    public int getItemCount() {
        return itemList.size();
    }

    // Method to get selected items for API
    public List<PickslipBean> getSelectedItems() {
        List<PickslipBean> selected = new ArrayList<>();
        for (PickslipBean item : itemList) {
            if (item.isSelected()) {
                selected.add(item);
            }
        }
        return selected;
    }
}
