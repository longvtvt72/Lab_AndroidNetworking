package com.example.lab_androidnetworking.Lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lab_androidnetworking.Lab02.Lab02_Bai1Activity;
import com.example.lab_androidnetworking.Lab02.Lab02_Bai2Activity;
import com.example.lab_androidnetworking.Lab02.Lab02_Bai3Activity;
import com.example.lab_androidnetworking.Lab02.Lab02_Bai4Activity;
import com.example.lab_androidnetworking.Lab02.MainActivityLab02;
import com.example.lab_androidnetworking.R;

public class MainActivityLab04 extends AppCompatActivity {
    private Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lab04);
        setTitle("Lab 4");

        button1 = findViewById(R.id.button1L4_1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityLab04.this, Lab04_Bai2Activity.class);
                startActivity(intent);
            }
        });


    }
}