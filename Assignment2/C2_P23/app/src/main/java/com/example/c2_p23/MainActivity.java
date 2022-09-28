package com.example.c2_p23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView light;
    private int[] check = new int[]{1, 2, 3};
    private int counter = 0;
    private int value = check[0];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        light = (TextView) findViewById(R.id.light);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                counter +=1;
                value = check[counter%3];

                if (value == 1){

                    light.setBackgroundColor(getResources().getColor(R.color.green));

                }
                else if (value == 2){

                    light.setBackgroundColor(getResources().getColor(R.color.yellow));

                }
                else if (value == 3){

                    light.setBackgroundColor(getResources().getColor(R.color.red));

                }

            }
        });

    }
}