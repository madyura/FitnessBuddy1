package com.example.fitnessbuddy;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class ProfileDetails1 extends AppCompatActivity {

    private TextView textViewAge;
    private SeekBar seekBarAge;
    private int age;

    private TextView textViewHeight;
    private SeekBar seekBarHeight;
    private int height;

    private TextView textViewWeight;
    private SeekBar seekBarWeight;
    private int weight;

    private RadioButton male;
    private RadioButton female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details1);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        Intent intent = getIntent();

        textViewAge = findViewById(R.id.textViewAgeNumberId);
        seekBarAge = findViewById(R.id.seekBarAgeId);
        seekBarAge.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                age = seekBarAge.getProgress();

                textViewAge.setText(age + " ");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        textViewHeight = findViewById(R.id.textViewHeightNumberId);
        seekBarHeight = findViewById(R.id.seekBarHeightId);
        seekBarHeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                height = seekBarHeight.getProgress();
                textViewHeight.setText(height + "cm");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        textViewWeight = findViewById(R.id.textViewWeightNumberId);
        seekBarWeight = findViewById(R.id.seekBarWeightId);
        seekBarWeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                weight = seekBarWeight.getProgress();
                textViewWeight.setText(weight + " kg");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    public void openProfileDetailsActivity2(View view) {
        Intent intent = new Intent(this, ProfileDetails2.class);
        startActivity(intent);
    }
}
