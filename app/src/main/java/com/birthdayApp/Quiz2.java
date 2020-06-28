package com.birthdayApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz2 extends AppCompatActivity {

    RadioGroup Question1, Question2, Question3;
    Button Submit1, Submit2, Submit3, Reward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        Question1 = findViewById(R.id.q1optionsquiz2);
        Question2 = findViewById(R.id.q2optionsquiz2);
        Question3 = findViewById(R.id.q3optionsquiz2);
        Submit1 = findViewById(R.id.q1Submitquiz2);
        Submit2 = findViewById(R.id.q2Submitquiz2);
        Submit3 = findViewById(R.id.q3Submitquiz2);
        Reward = findViewById(R.id.nextButtonquiz2);

        Submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedradioID = Question1.getCheckedRadioButtonId();
                RadioButton selectedradioButton = findViewById(selectedradioID);
                if(selectedradioButton.getText().equals("99 pancakes")) {
                    Submit2.setVisibility(View.VISIBLE);
                    Toast.makeText(Quiz2.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(Quiz2.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
            }
        });

        Submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedradioID = Question2.getCheckedRadioButtonId();
                RadioButton selectedradioButton = findViewById(selectedradioID);
                if(selectedradioButton.getText().equals("Writing")) {
                    Submit3.setVisibility(View.VISIBLE);
                    Toast.makeText(Quiz2.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(Quiz2.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
            }
        });

        Submit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedradioID = Question3.getCheckedRadioButtonId();
                RadioButton selectedradioButton = findViewById(selectedradioID);
                if(selectedradioButton.getText().equals("Five bees - Baanina Haniyu")) {
                    Reward.setVisibility(View.VISIBLE);
                    Toast.makeText(Quiz2.this, "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(Quiz2.this, "WRONG ANSWER", Toast.LENGTH_SHORT).show();
            }
        });

        Reward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ItMe.class);
                startActivity(intent);
            }
        });
    }
}
