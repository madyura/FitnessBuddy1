package com.example.fitnessbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;


public class Menu extends AppCompatActivity {

    private TextView textViewBreakfast;
    private TextView textViewFirstSnack;
    private TextView textViewLunch;
    private TextView textViewSecondSnack;
    private TextView textViewDinner;
    private TextView textViewBreakfastDescription;
    private TextView textViewFirstSnackDescription;
    private TextView textViewLunchDescription;
    private TextView textViewSecondSnackDescription;
    private TextView textViewDinnerDescription;


//     Formula for calculating amount of food: ((процент каллорийности конкретного продукта
//     (из таблицы в экселе) из нормы рациона по КБЖУ умноженный на каллории человека, деленный на
//     количество каллорий в одном грамме продукта)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = getIntent();
        Menu menu = new Menu();

        textViewBreakfast = findViewById(R.id.textViewBreakfastId);
        textViewFirstSnack = findViewById(R.id.textViewFirstSnackId);
        textViewLunch = findViewById(R.id.textViewLunchId);
        textViewSecondSnack = findViewById(R.id.textViewSecondSnackId);
        textViewDinner = findViewById(R.id.textViewDinnerId);
        textViewBreakfastDescription = findViewById(R.id.textViewBreakfastDescriptionId);
        textViewFirstSnackDescription = findViewById(R.id.textViewFirstSnackDescriptionId);
        textViewLunchDescription = findViewById(R.id.textViewLunchDescriptionId);
        textViewSecondSnackDescription = findViewById(R.id.textViewSecondSnackDescriptionId);
        textViewDinnerDescription = findViewById(R.id.textViewDinnerDescriptionId);



        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        int calories = preferences.getInt("calories", 1);

        int resultEggWhites = (int) ((0.11 * calories) / 1.48);
        int resultOat = (int) ((0.09 * calories) / 3.85);
        int resultMilk = (int) ((0.04 * calories) / 0.4);
        int resultDriedFruits = (int) ((0.04 * calories) / 3.33);
        int resultDriedBread = (int) ((0.08 * calories) / 4);
        int resultHam = (int) ((0.06 * calories) / 0.2);
        int resultPickle = (int) ((0.01 * calories) / 1.5);
        int resultChickenBreast = (int) ((0.13 * calories) / 1.75);
        int resultBulgur = (int) ((0.11 * calories) / 3.53);
        int resultSalad = (int) ((0.04 * calories) / 0.5);
        int resultQuark = (int) ((0.07 * calories) / 0.7);
        int resultApple = (int) ((0.03 * calories) / 0.53);
        int resultFish = (int) ((0.1 * calories) / 1.3);
        int resultRice = (int) ((0.7 * calories) / 3.6);

        textViewBreakfast.setText(getString(R.string.breakfast) + ": " + getString(R.string.breakfast_description));
        textViewFirstSnack.setText(getString(R.string.first_snack) + ": " + getString(R.string.first_snack_description));
        textViewLunch.setText(getString(R.string.lunch) + ": " + getString(R.string.lunch_description));
        textViewSecondSnack.setText(getString(R.string.second_snack) + ": " + getString(R.string.second_snack_description));
        textViewDinner.setText(getString(R.string.dinner) + ": " + getString(R.string.dinner_description));


    }

}


//    int averageCalories;
//        if (calories < 1000) { averageCalories = 1000;}
//        else if (1001 < calories && calories < 1200) {averageCalories = 1100;}
//        else if (1201 < calories && calories < 1400) {averageCalories = 1300;}
//        else if (1401 < calories && calories < 1600) {averageCalories = 1500;}
//        else if (1601 < calories && calories < 1800) {averageCalories = 1700;}
//        else if (1801 < calories && calories < 2000) {averageCalories = 1900;}
//        else if (2001 < calories && calories < 2200) {averageCalories = 2100;}
//        else if (2201 < calories && calories < 2400) {averageCalories = 2300;}
//        else if (2401 < calories && calories < 2800) {averageCalories = 2600;}
//        else if (2601 < calories && calories < 3000) {averageCalories = 2800;}
//        else if (3001 < calories && calories < 3600) {averageCalories = 3300;}
//        else if (3601 < calories && calories < 4000) {averageCalories = 3800;}
//        else if (4001 < calories && calories < 5000) {averageCalories = 4500;}
//        else {averageCalories = 5000;}