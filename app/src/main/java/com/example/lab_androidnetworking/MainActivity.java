package com.example.lab_androidnetworking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_androidnetworking.Lab01.Bai3Activity;
import com.example.lab_androidnetworking.Lab01.Bai4Activity;
import com.example.lab_androidnetworking.Lab01.MainActivityLab01;
import com.example.lab_androidnetworking.Lab02.MainActivityLab02;
import com.example.lab_androidnetworking.Lab03.MainActivityLab03;
import com.example.lab_androidnetworking.Lab04.MainActivityLab04;
import com.example.lab_androidnetworking.Lab05.MainActivityLab05;
import com.example.lab_androidnetworking.Lab06.MainActivityLab06;
import com.example.lab_androidnetworking.Lab07.MainActivityLab07;
import com.example.lab_androidnetworking.Lab08.MainActivityLab08;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5, button6, button7, button8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("LAB ANDROID NETWORK");

        button1 = findViewById(R.id.button001);
        button2 = findViewById(R.id.button002);
        button3 = findViewById(R.id.button003);
        button4 = findViewById(R.id.button004);
        button5 = findViewById(R.id.button005);
//        button6 = findViewById(R.id.button006);
//        button7 = findViewById(R.id.button007);
//        button8 = findViewById(R.id.button008);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.lab_androidnetworking.MainActivity.this, MainActivityLab01.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.lab_androidnetworking.MainActivity.this, MainActivityLab02.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.lab_androidnetworking.MainActivity.this, MainActivityLab03.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.lab_androidnetworking.MainActivity.this, MainActivityLab04.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.lab_androidnetworking.MainActivity.this, MainActivityLab05.class);
                startActivity(intent);
            }
        });

//        button6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(com.example.lab_androidnetworking.MainActivity.this, MainActivityLab06.class);
//                startActivity(intent);
//            }
//        });
//
//        button7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(com.example.lab_androidnetworking.MainActivity.this, MainActivityLab07.class);
//                startActivity(intent);
//            }
//        });
//
//        button8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(com.example.lab_androidnetworking.MainActivity.this, MainActivityLab08.class);
//                startActivity(intent);
//            }
//        });

    }
}