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

import WMS.example.WMS.repository.local.model.Wms_Tran_DTL;
import WMS.example.WMS.ui.activity.ProductDetailsActivity;
import WMS.example.WMS.ui.activity.PutAwayActivity;
import WMS.example.WMS.ui.viewmodel.PutAwayViewModel;
import WMS.example.WMS.util.MedicoResources;

import com.codeone.wms.R;

import java.util.List;

public class PutAwayListAdapter extends RecyclerView.Adapter<PutAwayListAdapter.ViewHolder> {

    private final List<Wms_Tran_DTL> wmsTranDtls;
    Context context;

    public PutAwayListAdapter( List<Wms_Tran_DTL> wmsTranDtls, Context context) {
        this.wmsTranDtls = wmsTranDtls;
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
    public PutAwayListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = null;
        try {
            itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.put_away_adapter_list, parent, false);


        } catch (Exception e) {
            e.printStackTrace();

        }
        return new PutAwayListAdapter.ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull PutAwayListAdapter.ViewHolder holder, int position) {
        Wms_Tran_DTL wmstranObj = wmsTranDtls.get(position);
        try {


            holder.prodName.setText(MedicoResources.toCamelCase(wmstranObj.getProd_name()));
            holder.batchNo.setText(wmstranObj.getBatch_name());
            holder.putwy_qty.setText(String.valueOf(wmstranObj.getTran_qty()));
            holder.product_obj_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    PutAwayViewModel viewModel = new PutAwayViewModel();
                    String bin_code=viewModel.getbincodeByBinId(wmstranObj.getBin_id());
                    Intent intent = new Intent(context, ProductDetailsActivity.class).putExtra("wmsTranId", wmstranObj.getTran_dtl_id().toString()).putExtra("binCode",bin_code);
                    context.startActivity(intent);

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return wmsTranDtls.size();

    }
}
