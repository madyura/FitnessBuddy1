package com.example.fitnessbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;


public class Menu extends AppCompatActivity {

    int calories = getCalories();

    // Formula for calculating amount of food: ((процент каллорийности конкретного продукта
    // (из таблицы в экселе) из нормы рациона по КБЖУ умноженный на каллории человека, деленный на
    // количество каллорий в одном грамме продукта)

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent intent = getIntent();
        Menu menu = new Menu();
    }


    public int getCalories(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        int calories = preferences.getInt("calories", 1);
        return calories;
    }

    public int getAverageCalories(){
        int averageCalories;
        int calories = getCalories();
        if (calories < 1000) { averageCalories = 1000;}
        else if (1001 < calories && calories < 1200) {averageCalories = 1100;}
        else if (1201 < calories && calories < 1400) {averageCalories = 1300;}
        else if (1401 < calories && calories < 1600) {averageCalories = 1500;}
        else if (1601 < calories && calories < 1800) {averageCalories = 1700;}
        else if (1801 < calories && calories < 2000) {averageCalories = 1900;}
        else if (2001 < calories && calories < 2200) {averageCalories = 2100;}
        else if (2201 < calories && calories < 2400) {averageCalories = 2300;}
        else if (2401 < calories && calories < 2800) {averageCalories = 2600;}
        else if (2601 < calories && calories < 3000) {averageCalories = 2800;}
        else if (3001 < calories && calories < 3600) {averageCalories = 3300;}
        else if (3601 < calories && calories < 4000) {averageCalories = 3800;}
        else if (4001 < calories && calories < 5000) {averageCalories = 4500;}
        else {averageCalories = 5000;}
        return averageCalories;
    }


}


