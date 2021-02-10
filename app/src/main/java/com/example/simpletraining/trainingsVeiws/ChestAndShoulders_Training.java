package com.example.simpletraining.trainingsVeiws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

import com.example.simpletraining.MainMenuTraining;
import com.example.simpletraining.R;

public class ChestAndShoulders_Training extends AppCompatActivity {

    private Button buttonEndTraining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_and_shoulders__training);
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
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=bench+press+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openBenchDips(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=bench+dips+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openOverheadPress(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=overhead+press+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openDumbbellFly(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=dumbbell+fly+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }
}