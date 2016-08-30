package com.example.sahil.fitnessapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ImageView settingImg = (ImageView) findViewById(R.id.settingImg);
        TextView settingTxt =(TextView) findViewById(R.id.settingTxt);
        LinearLayout settingBg = (LinearLayout) findViewById(R.id.settingBg);
        Button selectBtn = (Button) findViewById(R.id.selectBtn);

        String settingTitle=getIntent().getStringExtra(MainActivity.EXERCISE_ITEM_TITLE);
        settingTxt.setText(settingTitle);

        if(settingTitle.equalsIgnoreCase(MainActivity.SETTING_DEATIL)){
            settingImg.setImageDrawable(getResources().getDrawable(R.drawable.setting, getApplicationContext().getTheme()));
            settingBg.setBackgroundColor(Color.parseColor("#91989e"));
        }

        selectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }



}
