package com.example.blackcoffer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecylerMerchantAdapter extends RecyclerView.Adapter<RecylerMerchantAdapter.ViewHolder> {


    Context context;
    ArrayList<MerchantModel> arrDetails;

    public RecylerMerchantAdapter(Context context, ArrayList<MerchantModel> arrDetails) {
        this.context = context;
        this.arrDetails = arrDetails;
    }

    @NonNull
    @Override
    public RecylerMerchantAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.merchant_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecylerMerchantAdapter.ViewHolder holder, int position) {
        holder.txtName.setText(arrDetails.get(position).name);
        holder.txtLocation.setText(arrDetails.get(position).location);
        holder.txtDistance.setText(arrDetails.get(position).distance);
    }

    @Override
    public int getItemCount() {
        return arrDetails.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtName, txtLocation, txtDistance;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtLocation = itemView.findViewById(R.id.txtLocation);
            txtDistance = itemView.findViewById(R.id.txtDistance);
        }
    }
}
