package com.example.blackcoffer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecylerPersonalAdapter extends RecyclerView.Adapter<RecylerPersonalAdapter.ViewHolder> {

    Context context;
    ArrayList<PersonalModel> arrDetails;
    public RecylerPersonalAdapter(Context context, ArrayList<PersonalModel> arrDetails) {
        this.context = context;
        this.arrDetails = arrDetails;
    }

    @NonNull
    @Override
    public RecylerPersonalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.personal_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecylerPersonalAdapter.ViewHolder holder, int position) {
        holder.txtInvite.setText(arrDetails.get(position).invite);
        holder.txtName.setText(arrDetails.get(position).name);
        holder.txtLocation.setText(arrDetails.get(position).location);
        holder.txtJobRole.setText(arrDetails.get(position).jobRole);
        holder.txtDistance.setText(arrDetails.get(position).distance);



    }

    @Override
    public int getItemCount() {
        return arrDetails.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtInvite, txtName, txtLocation, txtJobRole, txtDistance;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtInvite = itemView.findViewById(R.id.txtInvite);
            txtName = itemView.findViewById(R.id.txtName);
            txtLocation = itemView.findViewById(R.id.txtLocation);
            txtJobRole = itemView.findViewById(R.id.txtRole);
            txtDistance = itemView.findViewById(R.id.txtDistance);

        }
    }
}
