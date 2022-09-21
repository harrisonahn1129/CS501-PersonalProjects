package com.example.emailchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private TextView sign;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        sign = (TextView) findViewById(R.id.sign);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String e;
                String output;

                e = email.getText().toString();

                if (e.contains("@")) {
                    output = "VALID";
                }
                else {
                    output = "INVALID";
                }
                sign.setText(output);

            }
        });

    }
}