package WMS.example.WMS.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import WMS.example.WMS.repository.local.model.Wms_Tran_DTL;
import WMS.example.WMS.ui.activity.PickingActivity;
import WMS.example.WMS.ui.activity.PickingProductActivity;
import com.example.WMS.R;

import java.util.List;

public class PickingAdapter extends RecyclerView.Adapter<PickingAdapter.ViewHolder> {
    private List<Wms_Tran_DTL> wmsTranDtls;


    public PickingAdapter(PickingActivity pickingActivity, List<Wms_Tran_DTL> wmsTranDtls) {
        this.wmsTranDtls=wmsTranDtls;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder  {
        TextView prodName,wmsDtlId;
        //private static RecyclerViewClickListener itemListener;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            prodName = itemView.findViewById(R.id.picking_prodName);
            wmsDtlId=itemView.findViewById(R.id.picking_hidden_pk);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int n=getAdapterPosition();

                    // Toast.makeText(view.getContext(), "Hello Product", Toast.LENGTH_SHORT).show();
                    Context context = view.getContext();
                    Intent intent = new Intent(context, PickingProductActivity.class).putExtra("wmsTranId",wmsDtlId.getText());
                    Toast.makeText(itemView.getContext(), "Position"+prodName.getText()+" @@@@@ "+wmsDtlId.getText(), Toast.LENGTH_SHORT).show();
                    context.startActivity(intent);

                }

            });
        }

    }

    @NonNull
    @Override
    public PickingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = null;
        try {
            itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.picking_details, parent, false);


        } catch (Exception e) {
            e.printStackTrace();

        }
        return new PickingAdapter.ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull PickingAdapter.ViewHolder holder, int position) {

        try{
            //  Wms_Tran_DTL wms_tran_dtl = wmsTranDtls.get(position);
            for( Wms_Tran_DTL wms : wmsTranDtls){
                //  wmsTranDtls.get(position);

                if(wmsTranDtls.get(position).getProd_name().equalsIgnoreCase(wms.getProd_name())){
                    holder.prodName.setText(wms.getProd_name());
                }
                if(wmsTranDtls.get(position).getTran_dtl_id().equals(wms.getTran_dtl_id())){
                    holder.wmsDtlId.setText(String.valueOf(wms.getTran_dtl_id()));
                }
                Log.v("holder","position"+wmsTranDtls.get(position).getPk().equals(wms.getTran_dtl_id()));

                //break;

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return wmsTranDtls.size();

    }
}
