package com.example.fitnessbuddy;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


public abstract class Food_nutritions extends Context {


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
