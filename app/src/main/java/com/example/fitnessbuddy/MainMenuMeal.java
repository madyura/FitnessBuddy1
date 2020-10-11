package com.example.fitnessbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenuMeal extends AppCompatActivity {

    private TextView textViewButtonTraining;
    private Button buttonSeeMenu;
    private TextView textViewMealGoal;
    private TextView textViewMealProteins;
    private TextView textViewMealCarbs;
    private TextView textViewMealFat;
    private TextView textViewMealCalories;
    private Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_meal);

        textViewButtonTraining = findViewById(R.id.textViewButtonTrainingId);
        buttonSeeMenu = findViewById(R.id.buttonSeeMenuId);
        textViewMealGoal = findViewById(R.id.textViewMealGoalId);
        textViewMealProteins = findViewById(R.id.textViewMealProteinsId);
        textViewMealCarbs = findViewById(R.id.textViewMealCarbsId);
        textViewMealFat = findViewById(R.id.textViewMealFatId);
        textViewMealCalories = findViewById(R.id.textViewMealCaloriesId);
        settingsButton = findViewById(R.id.settingsButtonId);

        setPFC();
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String goal = String.format("%s %s", getString(R.string.goal), preferences.getString("goalCoeficient", "error"));
        preferences.getInt("calories", 1);
        textViewMealGoal.setText(goal);

        textViewButtonTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMenuTraining = new Intent(getApplicationContext(), MainMenuTraining.class);
                startActivity(openMenuTraining);
            }
        });

        buttonSeeMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openSeeMenu = new Intent(getApplicationContext(), Menu.class);
                startActivity(openSeeMenu);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSettings = new Intent(getApplicationContext(), Settings.class);
                startActivity(goToSettings);
            }
        });
    }

        public void setPFC () {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        int calories = preferences.getInt("calories", 1);
        int protein = (int) Math.round(calories*0.35/4);
        int fat =  (int) Math.round((calories*0.2)/8);
        int carb = (int) Math.round((calories*0.45)/4);
        textViewMealProteins.setText(String.format("%s %s g", getString(R.string.proteins), protein));
        textViewMealCarbs.setText(String.format("%s %s g", getString(R.string.carbs), carb));
        textViewMealFat.setText(String.format("%s %s g", getString(R.string.fats), fat));
        textViewMealCalories.setText(String.format("%s %s", getString(R.string.calories), calories));

        }




}
