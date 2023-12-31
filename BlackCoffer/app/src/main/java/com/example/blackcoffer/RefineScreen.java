package com.example.blackcoffer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RefineScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine_screen);

       // find id's here
        Spinner spinner = findViewById(R.id.spinner);
        ImageView imgBack = findViewById(R.id.imgBack);
        SeekBar seekBar = findViewById(R.id.seekBar);
        TextView selectedRangeText = findViewById(R.id.selectedRangeText);

        // add content on spinner
        ArrayList<String> arrAvailable = new ArrayList<>();
        arrAvailable.add("Available | Hey Let Us Connect");
        arrAvailable.add("Away | Stay Discrete And Watch");
        arrAvailable.add("Busy | Do Not Disturb | Will Catch Up Later");
        arrAvailable.add("SOS | Emergency! Need Assistance! HELP");

        // set content on spinner with the help of default android adapter
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(RefineScreen.this,
                android.R.layout.simple_list_item_1, arrAvailable);
        spinner.setAdapter(spinnerAdapter);

        // user can select ranges
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Calculate the actual selected range in km
                int selectedRange = progress + 1;
                // Update the TextView to display the selected range
                selectedRangeText.setText("Selected Range: 1 km - " + selectedRange + " km");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Do nothing on touch start
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Do nothing on touch stop
            }
        });

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RefineScreen.this, MainActivity.class));
                finish();
            }
        });

    }
}