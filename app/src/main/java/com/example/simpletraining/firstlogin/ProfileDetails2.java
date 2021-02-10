package com.example.simpletraining.firstlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.simpletraining.MainMenuTraining;
import com.example.simpletraining.R;

public class ProfileDetails2 extends AppCompatActivity {

    private Button buttonFinish;
    private TextView textViewDescriptionOfActivityLevel;
    private RadioGroup fitnessGoal;
    private RadioButton chosenFitnessGoal;
    private RadioGroup radioGroupActivityLevel;
    private RadioButton chosenActivityLevel;
    private double activityCoeficient;

    private int age;
    private int height;
    private int weight;
    private int sexCoeficient;
    private int caloriesPerDay = 1;
    private double goalCoeficient = 1;
    private boolean wasEnded = true;
    private String goal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details2);
        Intent intent = getIntent();
        if (intent !=null && intent.hasExtra("age") && intent.hasExtra("height") && intent.hasExtra("weight") && intent.hasExtra("sexCoeficient")){
            age = intent.getIntExtra("age", 1);
            height = intent.getIntExtra("height", 1);
            weight = intent.getIntExtra("weight", 1);
            sexCoeficient = intent.getIntExtra("sexCoeficient", 5);
        } else {
            Intent goBackIntent = new Intent(this, ProfileDetails1.class);
            startActivity(goBackIntent);
            Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_LONG).show();
        }

        textViewDescriptionOfActivityLevel = findViewById(R.id.textViewDescriptionOfActivityLevelId);
        fitnessGoal = findViewById(R.id.radioGroupFitnessGoal);
        radioGroupActivityLevel = findViewById(R.id.radioGroupActivityLevel);

        fitnessGoal.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                chosenFitnessGoal = findViewById(checkedId);
                switch (chosenFitnessGoal.getId()){
                    case R.id.radioButtonFatLossId: {
                        goalCoeficient = 0.8;
                        goal = getString(R.string.fat_loss);
                    }
                    break;
                    case R.id.radioButtonMaintenanceId:{
                        goalCoeficient = 1;
                        goal = getString(R.string.maintenance);
                    }
                    break;

                    case R.id.radioButtonMuscleGainId: {
                        goalCoeficient = 1.2;
                        goal = getString(R.string.muscle_gain);
                    }
                    break;
                }
            }
        });


        radioGroupActivityLevel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                chosenActivityLevel = findViewById(checkedId);
                switch (chosenActivityLevel.getId()){
                    case R.id.radioButtonLightlyActiveId: {
                        activityCoeficient = 1.2;
                        textViewDescriptionOfActivityLevel.setText(R.string.lightly_active_desc);

                    }
                    break;
                    case R.id.radioButtonModeratelyActiveId: {
                        activityCoeficient = 1.375;
                        textViewDescriptionOfActivityLevel.setText(R.string.moderately_active_desc);
                    }
                    break;
                    case R.id.radioButtonVeryActiveId: {
                        activityCoeficient = 1.55;
                        textViewDescriptionOfActivityLevel.setText(R.string.very_active_desc);
                    }
                    break;
                    case R.id.radioButtonExtraActiveId: {
                        activityCoeficient = 1.725;
                        textViewDescriptionOfActivityLevel.setText(R.string.extra_active_desc);
                    }
                }
            }
        });

        buttonFinish = findViewById(R.id.buttonFinishId);



    }

    public void finishProfileDetailsButton(View view) {
        if (goal != null && activityCoeficient != 0){
        caloriesPerDay = (int) ((10 * weight + 6.25 * height - 5 * age + sexCoeficient) * activityCoeficient * goalCoeficient);
        textViewDescriptionOfActivityLevel = findViewById(R.id.textViewDescriptionOfActivityLevelId);
        textViewDescriptionOfActivityLevel.setText(String.format("%s", caloriesPerDay));
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        preferences.edit().putBoolean("ended", wasEnded).apply(); //this will be needed to check if application was opened before
        preferences.edit().putInt("calories", caloriesPerDay).apply();
        preferences.edit().putInt("weight", weight).apply();
        preferences.edit().putInt("height", height).apply();
        preferences.edit().putInt("age", age).apply();
        preferences.edit().putString("goalCoeficient", goal).apply();
        preferences.edit().putBoolean("wasOpened", true).apply();
         Intent intent = new Intent(this, MainMenuTraining.class);
         startActivity(intent);} else {
            Toast.makeText(this, "Enter all fields", Toast.LENGTH_SHORT).show();
        }
    }
}
