package com.example.blackcoffer;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class BusinessFragment extends Fragment {

    Context context;

    public BusinessFragment(Context context) {
        this.context = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_business, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        ArrayList<BuisnessModel> arrDetails = new ArrayList<>();
        arrDetails.add(new BuisnessModel("+ Invite", "QAProdShubham Gangrade", "Bhopal",
                "Withing 1.3 Km"));
        arrDetails.add(new BuisnessModel("Pending", "Rubina Whaeed", "Bhopal",
                "Withing 1.5 Km"));
        arrDetails.add(new BuisnessModel("+ Invite", "Rajeev Chaturvedi", "Bhopal",
                "Withing 1.9 Km"));
        arrDetails.add(new BuisnessModel("+ Invite", "Ajay Sharma", "Bhopal",
                "Withing 3.3 Km"));
        arrDetails.add(new BuisnessModel("+ Pending", "Rajkumar Rao", "Bhopal",
                "Withing 4.4 Km"));
        arrDetails.add(new BuisnessModel("+ Invite", "Karan Kumar Singh", "Bhopal",
                "Withing 5.3 Km"));

        RecylerBusinessAdapter adapter = new RecylerBusinessAdapter(context, arrDetails);
        recyclerView.setAdapter(adapter);


        return view;
    }
}