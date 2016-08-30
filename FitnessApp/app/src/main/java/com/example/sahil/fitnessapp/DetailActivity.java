package com.example.sahil.fitnessapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView exerciseTxt = (TextView) findViewById(R.id.exerciseText);
        ImageView exerciseImg = (ImageView) findViewById(R.id.exerciseImage);
        LinearLayout exerciseLayout = (LinearLayout) findViewById(R.id.mainBG);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXERCISE_ITEM_TITLE);
        exerciseTxt.setText(exerciseTitle);

        if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHT)){
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            exerciseLayout.setBackgroundColor(Color.parseColor("#2a93e2"));
        }

        else if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)){
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            exerciseLayout.setBackgroundColor(Color.parseColor("#b549bc"));
        }

        else if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_CARDIO)){
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            exerciseLayout.setBackgroundColor(Color.parseColor("#49bc66"));
        }

    }
}
