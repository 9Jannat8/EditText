package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1, editText2;
    private Button addBtn, subBtn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.ediText1);
        editText2 = findViewById(R.id.ediText2);

        addBtn = findViewById(R.id.btn1);
        subBtn = findViewById(R.id.btn2);

        textView = findViewById(R.id.result);

        addBtn.setOnClickListener(this);
        subBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        try {

            String num1 = editText1.getText().toString();
            String num2 = editText2.getText().toString();

            //converting into double
            double numb1 = Double.parseDouble(num1);
            double numb2 = Double.parseDouble(num2);

            if(v.getId() == R.id.btn1) {
                double sum = numb1 + numb2;
                textView.setText("Result = " + sum);

            } else if(v.getId() == R.id.btn2) {
                double sub = numb1 - numb2;
                textView.setText("Result = " + sub);
            }

        } catch(Exception e) {

            Toast.makeText(MainActivity.this, "Please enter numbers", Toast.LENGTH_SHORT).show();

        }

    }
}