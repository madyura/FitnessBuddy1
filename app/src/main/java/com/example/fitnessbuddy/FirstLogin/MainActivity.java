package com.example.fitnessbuddy.FirstLogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fitnessbuddy.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
   }

    public void openProfileDetails1Activity(View view) {
        Intent intent = new Intent(this, ProfileDetails1.class);
        startActivity(intent);

}
}
