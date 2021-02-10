package com.example.simpletraining;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.simpletraining.firstlogin.ProfileDetails1;

public class Settings extends AppCompatActivity {

    private TextView textViewResetDoneTrainings;
    private TextView textViewEditDatas;
    private AlertDialog.Builder alertDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Intent intent = getIntent();

        textViewResetDoneTrainings = findViewById(R.id.textViewResetCounterId);
        textViewEditDatas = findViewById(R.id.textViewEditDatasId);


        textViewResetDoneTrainings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            alertDialog = new AlertDialog.Builder(Settings.this)
            .setTitle(getResources().getString(R.string.reset_counter))
            .setMessage(getResources().getString(R.string.are_you_sure))
            .setCancelable(true)
            .setPositiveButton(getResources().getString(R.string.yes), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        resetCounter();
                        }
            })
            .setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Settings.this.finish();
                }
            });
            AlertDialog alert = alertDialog.create();
            alert.show();

            }
        });


        textViewEditDatas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProfileDetails1.class);
                startActivity(intent);
            }
        });




    }


    public void resetCounter() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        preferences.edit().putInt("doneTrainings", 0).apply();
        Toast.makeText(getApplicationContext(), "Reset to 0", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), MainMenuTraining.class);
        startActivity(intent);

    }
}
