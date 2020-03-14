package com.example.fitnessbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;

import com.example.fitnessbuddy.FirstLogin.MainActivity;

public class MainMenuTraining extends AppCompatActivity {

    public boolean wasEnded;
    public TextView textViewButtonMeal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        checkIfWasOpened();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_training);
        Intent intent = getIntent();



    }

    public void checkIfWasOpened(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        wasEnded = preferences.getBoolean("ended", false);
        if (!wasEnded){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    public void openMainMenuMeal(View view) {
        Intent intent = new Intent(this, MainMenuMeal.class);
        startActivity(intent);
    }
}
