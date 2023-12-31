package com.example.blackcoffer;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    BottomNavigationView bnView;
    TabLayout tabLayout;
    ViewPager viewPager;
    LinearLayout refineScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbar);
        bnView = findViewById(R.id.bnView);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        refineScreen = findViewById(R.id.refineScreen);

        // set toolbar in main_activity
        setSupportActionBar(toolbar);

        refineScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RefineScreen.class));
            }
        });

        bnView.setSelectedItemId(R.id.nav_explore);
        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_explore) {
                    // for nav_explore we do nothing
                } else if (id == R.id.nav_network) {
                    Toast.makeText(MainActivity.this, "Network", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_chat) {
                    Toast.makeText(MainActivity.this, "Chat", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_contacts) {
                    Toast.makeText(MainActivity.this, "Contacts", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_groups) {
                    Toast.makeText(MainActivity.this, "Groups", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

        ViewPagerExploreAdapter viewPagerExploreAdapter = new ViewPagerExploreAdapter(getSupportFragmentManager(), MainActivity.this);
        viewPager.setAdapter(viewPagerExploreAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }

}