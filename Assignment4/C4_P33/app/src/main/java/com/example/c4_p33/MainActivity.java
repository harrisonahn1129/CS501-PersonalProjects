package com.example.c4_p33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button textInput_btn;
    public EditText textInput;
    public String text;
    private Boolean check;
    private String tested;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput = (EditText) findViewById(R.id.textInput);
        textInput_btn = (Button) findViewById(R.id.textInput_btn);

        textInput_btn.setOnClickListener(v -> {

            text = textInput.getText().toString();
            tested = textInput.getText().toString();

            check = Boolean.TRUE;
            for (int i = 0; i < tested.length(); i++){
                if (tested.charAt(i) == ' ') check = Boolean.TRUE;
                else if (Character.isUpperCase(tested.charAt(i))) {
                    check = Boolean.FALSE;
                    break;
                }
            }

            if (check.equals(Boolean.TRUE)){
                Intent intent = new Intent(MainActivity.this, shift_input.class);
                intent.putExtra("origin_text", text);
                startActivity(intent);
            }
            else if (check.equals(Boolean.FALSE)){
                Toast.makeText(getApplicationContext(), "Please enter lowercased text only", Toast.LENGTH_LONG).show();
            }

        });
    }

}



