package com.example.fitnessbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;

import com.example.fitnessbuddy.firstlogin.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                boolean wasOpened = preferences.getBoolean("wasOpened", false);
                if (wasOpened) {
                    Intent intent = new Intent(getApplicationContext(), MainMenuTraining.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }

            }
        }, 2000);
    }
}
