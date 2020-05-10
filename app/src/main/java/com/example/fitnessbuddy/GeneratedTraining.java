package com.example.fitnessbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

public class GeneratedTraining extends AppCompatActivity {


    private Button buttonEndTraining;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generated_training);
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


}
