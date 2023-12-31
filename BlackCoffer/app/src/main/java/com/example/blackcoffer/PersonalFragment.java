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

public class PersonalFragment extends Fragment {


    Context context;
    public PersonalFragment(Context context) {
        this.context = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_personal, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        ArrayList<PersonalModel> arrDetails = new ArrayList<>();
        arrDetails.add(new PersonalModel("+ Invite", "Ajay Soni", "Bhopal"
        , "Software Developer", "Withing 1.3 KM"));
        arrDetails.add(new PersonalModel("+ Invite", "Ankita Gupta", "Bhopal"
                , "Software Developer", "Withing 2.3 KM"));
        arrDetails.add(new PersonalModel("Pending", "Karan Kumar Singh", "Bhopal"
                , "Software Developer", "Withing 3.3 KM"));
        arrDetails.add(new PersonalModel("+ Invite", "Divya Sharma", "Bhopal"
                , "Software Developer", "Withing 4.3 KM"));
        arrDetails.add(new PersonalModel("Pending", "Ajay Sharma", "Bhopal"
                , "Software Developer", "Withing 5.3 KM"));


        RecylerPersonalAdapter adapter = new RecylerPersonalAdapter(context, arrDetails);
        recyclerView.setAdapter(adapter);

        return view;
    }
}