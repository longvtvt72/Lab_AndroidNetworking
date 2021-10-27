package com.example.lab_androidnetworking.Lab02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_androidnetworking.R;

public class MainActivityLab02 extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lab02);
        setTitle("Lab 2");

        button1 = findViewById(R.id.button1L2_1);
        button2 = findViewById(R.id.button2L2_1);
        button3 = findViewById(R.id.button3L2_1);
        button4 = findViewById(R.id.button4L2_1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityLab02.this, Lab02_Bai1Activity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityLab02.this, Lab02_Bai2Activity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityLab02.this, Lab02_Bai3Activity.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityLab02.this, Lab02_Bai4Activity.class);
                startActivity(intent);
            }
        });
    }
}