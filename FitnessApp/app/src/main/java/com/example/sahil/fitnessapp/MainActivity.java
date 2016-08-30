package com.example.sahil.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXERCISE_ITEM_TITLE = "extra.item.title";
    public static final String EXERCISE_WEIGHT = "Weight Lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";
    public static final String SETTING_DEATIL = "Settings";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RelativeLayout weighBtn = (RelativeLayout) findViewById(R.id.wightBtn);
        RelativeLayout yogaBtn = (RelativeLayout) findViewById(R.id.yogaBtn);
        RelativeLayout cardioBtn = (RelativeLayout) findViewById(R.id.cardioBtn);
        RelativeLayout settingBtn = (RelativeLayout) findViewById(R.id.settingId);

        weighBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetails(MainActivity.EXERCISE_WEIGHT);
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetails(MainActivity.EXERCISE_YOGA);
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetails(MainActivity.EXERCISE_CARDIO);
            }
        });

        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                settingDetails(MainActivity.SETTING_DEATIL);
            }
        });
    }
        public void loadDetails(String excersice){
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(MainActivity.EXERCISE_ITEM_TITLE,excersice);
            startActivity(intent);

    }

    public void settingDetails(String setting){
        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
        intent.putExtra(MainActivity.EXERCISE_ITEM_TITLE, setting);
        startActivity(intent);
    }

}
