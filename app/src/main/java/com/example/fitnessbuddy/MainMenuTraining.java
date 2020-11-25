package com.example.fitnessbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.fitnessbuddy.trainingsVeiws.BackAndBiceps_Training;
import com.example.fitnessbuddy.trainingsVeiws.FullBody_Training;
import com.example.fitnessbuddy.trainingsVeiws.LegsAndTriceps_Training;
import com.example.fitnessbuddy.trainingsVeiws.ChestAndShoulders_Training;

public class MainMenuTraining extends AppCompatActivity {

    private Button buttonStartTraining;
    private TextView textViewDoneTrainings;
    private TextView textViewButtonMeal;
    public String doneTrainings;
    private Button settingsButton;
    private ListView trainingsList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_training);

        textViewButtonMeal = findViewById(R.id.textViewButtonMealId);
        textViewDoneTrainings = findViewById(R.id.textViewDoneTrainingsId);
        settingsButton = findViewById(R.id.settingsButtonId);
        trainingsList = findViewById(R.id.listViewListOfTrainings);
        trainingsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(getApplicationContext(), FullBody_Training.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), BackAndBiceps_Training.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), LegsAndTriceps_Training.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), ChestAndShoulders_Training.class);
                        startActivity(intent3);
                        break;
                }
            }
        });




//        buttonStartTraining.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent goToGeneratedTraining = new Intent(getApplicationContext(), GeneratedTraining.class);
//                startActivity(goToGeneratedTraining);
//            }
//        });

        textViewButtonMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMainMenuMeal = new Intent(getApplicationContext(), MainMenuMeal.class);
                startActivity(goToMainMenuMeal);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSettings = new Intent(getApplicationContext(), Settings.class);
                startActivity(goToSettings);
            }
        });

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        doneTrainings = String.format("%s %d" , getString(R.string.trainingsdone), preferences.getInt("doneTrainings", 0));
        textViewDoneTrainings.setText(doneTrainings);

    }
}
