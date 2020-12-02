package com.example.fitnessbuddy.trainingsVeiws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fitnessbuddy.R;



public class BackAndBiceps_Training extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_and_biceps__training);
    }

    public void openWarmUp(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=gym+warm+up+exercises+for+beginners"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openDeadlift(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=dead+lift+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openLatPulldown(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=lat+pulldown+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openBarbellRow(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=barbell+row+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openBicepCurl(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=bicep+curl+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openCrunches(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=crunches+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }
}