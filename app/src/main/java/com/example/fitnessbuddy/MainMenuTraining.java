package com.example.fitnessbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class MainMenuTraining extends AppCompatActivity {

    private boolean wasEnded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_training);
        Intent intent = getIntent();


    }

    public void checkIfWasOpened(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        wasEnded = preferences.getBoolean("ended", false);
        if (wasEnded = false){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
