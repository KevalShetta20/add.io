package com.kevalshetta.lecture_1; ///should be unique

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);

        add = findViewById(R.id.add);
        result = findViewById(R.id.ans);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no1 = Integer.parseInt(num1.getText().toString());
                int no2 = Integer.parseInt(num2.getText().toString());

                int sum = no1+no2;
                result.setText("Add:" + String.valueOf(sum));
            }
        });
    }
}