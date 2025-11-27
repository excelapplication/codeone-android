package WMS.example.WMS.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.WMS.R;

import WMS.example.WMS.repository.local.model.Wms_trf_dtl;
import WMS.example.WMS.ui.activity.ProductDetailsActivity;
import WMS.example.WMS.ui.activity.TransferActivity;
import WMS.example.WMS.ui.activity.TransferDetailActivity;
import WMS.example.WMS.ui.viewmodel.PutAwayViewModel;
import WMS.example.WMS.util.MedicoResources;

import java.util.List;

public class StockTransferAdapter extends RecyclerView.Adapter<StockTransferAdapter.ViewHolder> {
    private final List<Wms_trf_dtl> wmsTrfDtls;
    Context context;

    public StockTransferAdapter(List<Wms_trf_dtl> wmsTrfDtls, Context context) {
        this.wmsTrfDtls = wmsTrfDtls;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView prodName, putwy_qty, batchNo;
        LinearLayout product_obj_layout;

        //private static RecyclerViewClickListener itemListener;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            prodName = itemView.findViewById(R.id.prodName);
            batchNo = itemView.findViewById(R.id.batchNo);
            putwy_qty = itemView.findViewById(R.id.putway_qty);
            product_obj_layout = itemView.findViewById(R.id.product_obj_layout);


        }

    }

    @NonNull
    @Override
    public StockTransferAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = null;
        try {
            itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.put_away_adapter_list, parent, false);


        } catch (Exception e) {
            e.printStackTrace();

        }
        return new StockTransferAdapter.ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull StockTransferAdapter.ViewHolder holder, int position) {
        Wms_trf_dtl wmstranObj = wmsTrfDtls.get(position);
        try {
            System.out.println("wmstranObj "+wmstranObj.toString());
            holder.prodName.setText(MedicoResources.toCamelCase(wmstranObj.getProd_name()));
            holder.batchNo.setText(wmstranObj.getOut_batch_name());
            holder.putwy_qty.setText(String.valueOf(wmstranObj.getIn_tran_qty()));
            holder.product_obj_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    System.out.println(""+wmstranObj.getTran_dtl_id());
                    PutAwayViewModel viewModel = new PutAwayViewModel();
                    String bin_code=viewModel.getbincodeByBinId(wmstranObj.getIn_bin_id());
                    Intent intent = new Intent(context, TransferDetailActivity.class).putExtra("wmsTranId", wmstranObj.getTran_dtl_id().toString()).putExtra("binCode",bin_code);
                    context.startActivity(intent);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return wmsTrfDtls.size();
    }
}
