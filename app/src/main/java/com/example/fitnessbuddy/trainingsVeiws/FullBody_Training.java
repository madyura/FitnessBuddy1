package com.example.fitnessbuddy.trainingsVeiws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.fitnessbuddy.R;



public class FullBody_Training extends AppCompatActivity {

    private TextView textViewLegPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_body__training);


    }

    public void openLegPress(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=leg+press+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }


    public void openLatPulldown(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=lat+pulldown+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }


    public void openBenchPress(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=bench+press+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openDumbbellShoulderPress(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=dumbbell+shoulder+press+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openDumbbellBicepCurl(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=dumbbell+bicep+curl+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    public void openTricepsPushdownId(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/results?search_query=tricep+push+down+technique"));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }
}