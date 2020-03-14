package com.example.fitnessbuddy.FirstLogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fitnessbuddy.R;

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
        seekBarAge.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                age = seekBarAge.getProgress();
                if (age != 1){
                textViewAge.setText(age + " " + getString(R.string.years));
                }else{
                    textViewAge.setText(age + " " + getString(R.string.year));
                }
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
                textViewHeight.setText(height + " cm");
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

        radioGroupSex = findViewById(R.id.radioGroupSex);
        radioGroupSex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
            radioButtonChosenSex = findViewById(checkedId);
            switch (radioButtonChosenSex.getId()){
                case R.id.radioButtonMaleId: {
                    sexCoeficient = 5;
                    Toast.makeText(getApplicationContext(), Integer.toString(sexCoeficient), Toast.LENGTH_SHORT).show();
                }
                break;
                case R.id.radioButtonFemaleId: {
                    sexCoeficient = -161;
                    Toast.makeText(getApplicationContext(), Integer.toString(sexCoeficient), Toast.LENGTH_SHORT).show();
                }
            }
            }
        }
        );
    }

    public void openProfileDetailsActivity2(View view) {
        Intent intent = new Intent(this, ProfileDetails2.class);
        intent.putExtra("age", age);
        intent.putExtra("height", height);
        intent.putExtra("weight", weight);
        intent.putExtra("sexCoeficient", sexCoeficient);
        startActivity(intent);
    }
}
