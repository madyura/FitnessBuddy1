package com.example.fitnessbuddy.trainingsVeiws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fitnessbuddy.R;

public class ChestAndShoulders_Training extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_and_shoulders__training);
    }

    public void openWarmUp(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=gym+warm+up+exercises+for+beginners"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }


    public void openBenchPress(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=bench+press+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openBenchDips(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=bench+dips+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openOverheadPress(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=overhead+press+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openDumbbellFly(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=dumbbell+fly+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }
}