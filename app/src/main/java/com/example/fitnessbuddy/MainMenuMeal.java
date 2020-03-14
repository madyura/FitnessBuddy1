package com.example.fitnessbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainMenuMeal extends AppCompatActivity {

    private TextView textViewButtonTraining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_meal);

        textViewButtonTraining = findViewById(R.id.textViewButtonTrainingId);

    }

    public void openMainMenuTraining(View view) {
        Intent intent = new Intent(this, MainMenuTraining.class);
        startActivity(intent);
    }
}
