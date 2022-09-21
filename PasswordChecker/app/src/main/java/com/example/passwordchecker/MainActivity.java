package com.example.passwordchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText pass1;
    private EditText pass2;
    private TextView label;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pass1 = (EditText) findViewById(R.id.Pass1);
        pass2 = (EditText) findViewById(R.id.Pass2);
        label = (TextView) findViewById(R.id.label);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String p1;
                String p2;
                String output;

                p1 = pass1.getText().toString();
                p2 = pass2.getText().toString();

                if (p1.contentEquals(p2)) {
                    output = "THANK YOU";
                }
                else {
                    output = "PASSWORDS MUST MATCH";
                }
                label.setText(output);

            }
        });

    }
}