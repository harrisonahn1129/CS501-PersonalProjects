package com.example.c4_p33;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class shift_input extends AppCompatActivity {

    private Button convert;
    private TextView origin;
    private TextView encrypted;
    private EditText shiftInput;
    private Integer num;
    private String convertText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shit_input);

        shiftInput = (EditText) findViewById(R.id.shitInput);
        convert = (Button) findViewById(R.id.convert);
        origin = (TextView) findViewById(R.id.origin);
        encrypted = (TextView) findViewById(R.id.encrypted);

        Intent intent = getIntent();
        String oristr = intent.getStringExtra("origin_text");

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.valueOf(shiftInput.getText().toString());

                if (num <= 0 || num >= 26) {
                    Toast.makeText(getApplicationContext(), "Please enter integer between 1 ~ 25", Toast.LENGTH_LONG).show();
                } else {

                    origin.setText(oristr);
                    convertText = encrypt.convertString(oristr, num);
                    encrypted.setText(convertText);

                }
            }
        });
    }
}
