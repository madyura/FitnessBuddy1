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



public class BackAndBiceps_Training extends AppCompatActivity {

    private Button buttonEndTraining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_and_biceps__training);
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

    public void openDeadlift(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=dead+lift+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openLatPulldown(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=lat+pulldown+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openBarbellRow(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=barbell+row+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openBicepCurl(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=bicep+curl+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openCrunches(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=crunches+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }
}