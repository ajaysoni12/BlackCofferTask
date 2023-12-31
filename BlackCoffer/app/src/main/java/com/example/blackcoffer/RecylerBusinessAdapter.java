package com.example.blackcoffer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecylerBusinessAdapter extends RecyclerView.Adapter<RecylerBusinessAdapter.ViewHolder>{

    Context context;
    ArrayList<BuisnessModel> arrDetails;
    public RecylerBusinessAdapter(Context context, ArrayList<BuisnessModel> arrDetails) {
        this.context = context;
        this.arrDetails = arrDetails;
    }

    @NonNull
    @Override
    public RecylerBusinessAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.buisness_row,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecylerBusinessAdapter.ViewHolder holder, int position) {
        holder.txtInvite.setText(arrDetails.get(position).invite);
        holder.txtName.setText(arrDetails.get(position).name);
        holder.txtLocation.setText(arrDetails.get(position).location);
        holder.txtDistance.setText(arrDetails.get(position).distance);
    }

    @Override
    public int getItemCount() {
        return arrDetails.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtInvite, txtName, txtLocation, txtDistance;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtInvite = itemView.findViewById(R.id.txtInvite);
            txtName = itemView.findViewById(R.id.txtName);
            txtLocation = itemView.findViewById(R.id.txtLocation);
            txtDistance = itemView.findViewById(R.id.txtDistance);

        }
    }
}
