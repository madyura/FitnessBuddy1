package com.example.fitnessbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileDetails2 extends AppCompatActivity {

    private Button buttonFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details2);
        Intent intent = getIntent();

        buttonFinish = findViewById(R.id.buttonFinishId);

    }

    public void finishProfileDetailsButton(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);

    }
}
