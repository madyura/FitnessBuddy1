package com.example.fitnessbuddy.trainingsVeiws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

import com.example.fitnessbuddy.MainMenuTraining;
import com.example.fitnessbuddy.R;

public class LegsAndTriceps_Training extends AppCompatActivity {

   private Button buttonEndTraining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs_and_triceps__training);
        buttonEndTraining = findViewById(R.id.buttonEndTrainingId);
        buttonEndTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                int doneTrainings = (preferences.getInt("doneTrainings", 0));
                doneTrainings++;
                preferences.edit().putInt("doneTrainings", doneTrainings).apply();
                Intent goToMainMenuTraining = new Intent(getApplicationContext(), MainMenuTraining.class);
                startActivity(goToMainMenuTraining);
            }
        });
    }


    public void openWarmUp(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=gym+warm+up+exercises+for+beginners"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }


    public void openBenchPress(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=squatr+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openSeatedCalfRaise(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=seated+calf+raise+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openCloseGripBenchPress(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=close+grip+bench+press+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openFrenchBenchPress(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=french+bench+press+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }
}