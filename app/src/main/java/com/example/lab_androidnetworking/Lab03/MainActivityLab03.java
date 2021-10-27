package com.example.lab_androidnetworking.Lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lab_androidnetworking.Lab02.Lab02_Bai3Activity;
import com.example.lab_androidnetworking.Lab02.Lab02_Bai4Activity;
import com.example.lab_androidnetworking.Lab03.bai1.Lab03_Bai1Activity;
import com.example.lab_androidnetworking.Lab03.bai2.Lab03_Bai2Activity;
import com.example.lab_androidnetworking.Lab03.bai3.Lab03_Bai3Activity;
import com.example.lab_androidnetworking.R;

public class MainActivityLab03 extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lab03);
        setTitle("Lab 3");

        button1 = findViewById(R.id.button1L3_1);
        button2 = findViewById(R.id.button2L3_1);
        button3 = findViewById(R.id.button3L3_1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityLab03.this, Lab03_Bai1Activity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityLab03.this, Lab03_Bai2Activity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityLab03.this, Lab03_Bai3Activity.class);
                startActivity(intent);
            }
        });


    }
}