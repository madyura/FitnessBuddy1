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
    private TextView textViewOatmeal;
    private TextView textViewMilk;
    private TextView textViewDriedFruits;
    private TextView textViewEggs;
    private TextView textViewDriedRiceBread;
    private TextView textViewHam;
    private TextView textViewPickle;
    private TextView textViewBulgur;
    private TextView textViewChickenBreast;
    private TextView textViewSalad;
    private TextView textViewQuark;
    private TextView textViewApple;
    private TextView textViewRice;
    private TextView textViewFish;
    private TextView textViewSalad2;



//     Formula for calculating amount of food: ((процент каллорийности конкретного продукта
//     (из таблицы в экселе) из нормы рациона по КБЖУ умноженный на каллории человека, деленный на
//     количество каллорий в одном грамме продукта)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = getIntent();

        textViewBreakfast = findViewById(R.id.textViewBreakfastId);
        textViewFirstSnack = findViewById(R.id.textViewFirstSnackId);
        textViewLunch = findViewById(R.id.textViewLunchId);
        textViewSecondSnack = findViewById(R.id.textViewSecondSnackId);
        textViewDinner = findViewById(R.id.textViewDinnerId);
        textViewOatmeal = findViewById(R.id.textViewOatmealId);
        textViewMilk = findViewById(R.id.textViewMilkId);
        textViewDriedFruits = findViewById(R.id.textViewDriedFruitsId);
        textViewEggs = findViewById(R.id.textViewEggsId);
        textViewDriedRiceBread = findViewById(R.id.textViewDriedRiceBreadId);
        textViewHam = findViewById(R.id.textViewHamId);
        textViewPickle = findViewById(R.id.textViewPickleId);
        textViewBulgur = findViewById(R.id.textViewBulgurId);
        textViewChickenBreast = findViewById(R.id.textViewChickenBreastId);
        textViewSalad = findViewById(R.id.textViewSaladId);
        textViewQuark = findViewById(R.id.textViewQuarkId);
        textViewApple = findViewById(R.id.textViewAppleId);
        textViewRice = findViewById(R.id.textViewRiceId);
        textViewFish = findViewById(R.id.textViewFishId);
        textViewSalad2 = findViewById(R.id.textViewSalad2Id);


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        int calories = preferences.getInt("calories", 1);

        int resultEggWhites = (int) ((0.11 * calories) / 1.48);
        int resultOat = (int) ((0.09 * calories) / 3.85);
        int resultMilk = (int) ((0.04 * calories) / 0.4);
        int resultDriedFruits = (int) ((0.04 * calories) / 3.33);
        int resultDriedRiceBread = (int) ((0.08 * calories) / 4);
        int resultHam = (int) ((0.06 * calories) / 1.5);
        int resultPickle = (int) ((0.01 * calories) / 0.2);
        int resultChickenBreast = (int) ((0.13 * calories) / 1.75);
        int resultBulgur = (int) ((0.11 * calories) / 3.53);
        int resultQuark = (int) ((0.07 * calories) / 0.7);
        int resultApple = (int) ((0.03 * calories) / 0.53);
        int resultFish = (int) ((0.1 * calories) / 1.3);
        int resultRice = (int) ((0.07 * calories) / 3.6);

        textViewBreakfast.setText(getString(R.string.breakfast) + ": " + getString(R.string.breakfast_description));
        textViewOatmeal.setText(getString(R.string.oatmeal) + ": " + resultOat + getString(R.string.grams));
        textViewMilk.setText(getString(R.string.milk) + ": " + resultMilk + getString(R.string.milliliters));
        textViewDriedFruits.setText(getString(R.string.dried_fruits) + ": " + resultDriedFruits + getString(R.string.grams));
        textViewEggs.setText(getString(R.string.eggs) + ": " + resultEggWhites + getString(R.string.grams));

        textViewFirstSnack.setText(getString(R.string.first_snack) + ": " + getString(R.string.first_snack_description));
        textViewDriedRiceBread.setText(getString(R.string.dried_rice) + ": " + resultDriedRiceBread + getString(R.string.grams));
        textViewHam.setText(getString(R.string.ham) + ": " + resultHam + getString(R.string.grams));
        textViewPickle.setText(getString(R.string.pickle) + ": " +  resultPickle + getString(R.string.grams));

        textViewLunch.setText(getString(R.string.lunch) + ": " + getString(R.string.lunch_description));
        textViewChickenBreast.setText(getString(R.string.chicken_breast) + ": " + resultChickenBreast + getString(R.string.grams));
        textViewBulgur.setText(getString(R.string.bulgur) + ": " + resultBulgur + getString(R.string.grams));
        textViewSalad.setText(getString(R.string.salad) + ": " + getString(R.string.unlimited));

        textViewSecondSnack.setText(getString(R.string.second_snack) + ": " + getString(R.string.second_snack_description));
        textViewQuark.setText(getString(R.string.quark) + ": " + resultQuark + getString(R.string.grams));
        textViewApple.setText(getString(R.string.apple) + ": " + resultApple + getString(R.string.grams));

        textViewDinner.setText(getString(R.string.dinner) + ": " + getString(R.string.dinner_description));
        textViewFish.setText(getString(R.string.fish) + ": " + resultFish + getString(R.string.grams));
        textViewRice.setText(getString(R.string.rice) + ": " + resultRice + getString(R.string.grams));
        textViewSalad2.setText(getString(R.string.salad) + ": " + getString(R.string.unlimited));






    }

}