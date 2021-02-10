package com.example.simpletraining.firstlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.simpletraining.R;

public class ProfileDetails1 extends AppCompatActivity {

    private TextView textViewAge;
    private TextView textViewHeight;
    private TextView textViewWeight;
    private SeekBar seekBarAge;
    private SeekBar seekBarHeight;
    private SeekBar seekBarWeight;
    private int age;
    private int height;
    private int weight;
    private int sexCoeficient = 5;
    private RadioButton radioButtonChosenSex;
    private RadioGroup radioGroupSex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details1);
        Intent intent = getIntent();

        textViewAge = findViewById(R.id.textViewAgeNumberId);
        seekBarAge = findViewById(R.id.seekBarAgeId);
        textViewHeight = findViewById(R.id.textViewHeightNumberId);
        seekBarHeight = findViewById(R.id.seekBarHeightId);
        textViewWeight = findViewById(R.id.textViewWeightNumberId);
        seekBarWeight = findViewById(R.id.seekBarWeightId);
        radioGroupSex = findViewById(R.id.radioGroupSex);

        seekBarAge.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                age = seekBarAge.getProgress();
                if (age != 1){

                textViewAge.setText(String.format("%s years", age));

                }else{
                    textViewAge.setText(String.format("%s year", age));
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekBarHeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                height = seekBarHeight.getProgress();
                textViewHeight.setText(String.format("%s cm", height));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekBarWeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                weight = seekBarWeight.getProgress();
                textViewWeight.setText(String.format("%s kg", weight));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        radioGroupSex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
            radioButtonChosenSex = findViewById(checkedId);
            switch (radioButtonChosenSex.getId()){
                case R.id.radioButtonMaleId: {
                    sexCoeficient = 5;
                }
                break;
                case R.id.radioButtonFemaleId: {
                    sexCoeficient = -161;
                }
            }
            }
        }
        );
    }

    public void openProfileDetailsActivity2(View view) {
        if (((age != 0) && (height != 0) && (weight != 0) && (sexCoeficient != 0))){
        Intent intent = new Intent(this, ProfileDetails2.class);
        intent.putExtra("age", age);
        intent.putExtra("height", height);
        intent.putExtra("weight", weight);
        intent.putExtra("sexCoeficient", sexCoeficient);
        startActivity(intent);
        } else {
            Toast.makeText(this, "Enter all fields", Toast.LENGTH_SHORT).show();
        }
    }
}
