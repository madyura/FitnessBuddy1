package com.example.fitnessbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fitnessbuddy.firstlogin.MainActivity;

import org.w3c.dom.Text;

public class MainMenuTraining extends AppCompatActivity {

    private Button buttonStartTraining;
    private TextView textViewDoneTrainings;
    private TextView textViewButtonMeal;
    public String doneTrainings;
    private Button settingsButton;
    private Spinner spinnerTrainingType;
    private ListView listViewTrainingDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_training);

        buttonStartTraining = findViewById(R.id.buttonStartTrainingId);
        textViewButtonMeal = findViewById(R.id.textViewButtonMealId);
        textViewDoneTrainings = findViewById(R.id.textViewDoneTrainingsId);
        settingsButton = findViewById(R.id.settingsButtonId);
        spinnerTrainingType = findViewById(R.id.spinnerTrainingTypesId);
        listViewTrainingDescription = findViewById(R.id.listViewTrainingDescriptionId);

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);


        spinnerTrainingType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
//                    case 0:
//                        listViewTrainingDescription.
//                        break;
//                    case 1:
//                        listViewTrainingDescription.
//                        break;
//                    case 2:
//                        listViewTrainingDescription.
//                        break;
//                    case 3:
//                        listViewTrainingDescription.
//                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        buttonStartTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToGeneratedTraining = new Intent(getApplicationContext(), GeneratedTraining.class);
                startActivity(goToGeneratedTraining);
            }
        });

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
