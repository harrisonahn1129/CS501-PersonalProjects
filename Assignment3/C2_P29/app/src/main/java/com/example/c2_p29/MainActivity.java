package com.example.c2_p29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText cornInput;
    private EditText sandInput;
    private EditText spaInput;
    private TextView totalCal;
    int totalSum = 0;
    int cornNum = 0;
    int sandNum = 0;
    int spaNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cornInput = (EditText) findViewById(R.id.corn_input);
        sandInput = (EditText) findViewById(R.id.sand_input);
        spaInput = (EditText) findViewById(R.id.spa_input);
        totalCal = (TextView) findViewById(R.id.total_cal);

        cornInput.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!cornInput.getText().toString().equalsIgnoreCase("")){
                    totalSum = Integer.parseInt(cornInput.getText().toString())*150 + Integer.parseInt(sandInput.getText().toString())*320 + Integer.parseInt(spaInput.getText().toString())*444;
                    totalCal.setText("Total Cal is: " + Integer.toString(totalSum) + " Cal");
                }

            }

        });

        sandInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!sandInput.getText().toString().equalsIgnoreCase("")) {
                    totalSum = Integer.parseInt(cornInput.getText().toString())*150 + Integer.parseInt(sandInput.getText().toString())*320 + Integer.parseInt(spaInput.getText().toString())*444;
                    totalCal.setText("Total Cal is: " + Integer.toString(totalSum) + " Cal");
                }
            }
        });

        spaInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!spaInput.getText().toString().equalsIgnoreCase("")) {
                    totalSum = Integer.parseInt(cornInput.getText().toString())*150 + Integer.parseInt(sandInput.getText().toString())*320 + Integer.parseInt(spaInput.getText().toString())*444;
                    totalCal.setText("Total Cal is: " + Integer.toString(totalSum) + " Cal");
                }
            }
        });


    }
}