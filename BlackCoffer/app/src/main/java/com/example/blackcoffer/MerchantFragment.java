package com.example.blackcoffer;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MerchantFragment extends Fragment {

    Context context;
    public MerchantFragment(Context context) {
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_merchant, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        ArrayList<MerchantModel> arrDetails = new ArrayList<>();
        arrDetails.add(new MerchantModel("TGI Resort and Villas", "Bhopal",
                "Withing 400-500 m"));
        arrDetails.add(new MerchantModel("Book and Book", "Bhopal",
                "Withing 500 - 600 m"));
        arrDetails.add(new MerchantModel("Holiday Homes and Resort", "Bhopal",
                "Withing 1 Km"));
        arrDetails.add(new MerchantModel("Shri GKS Nasha Mukti Kendra", "Kal Khedi",
                "Withing 1.1 Km"));
        arrDetails.add(new MerchantModel("IES University Bhopal", "Bhopal",
                "Withing 2.3 Km"));
        arrDetails.add(new MerchantModel("Faith Cricket Club Ratibad", "Bhopal",
                "Withing 3.7 Km"));

        RecylerMerchantAdapter adapter = new RecylerMerchantAdapter(context, arrDetails);
        recyclerView.setAdapter(adapter);

        return view;
    }
}