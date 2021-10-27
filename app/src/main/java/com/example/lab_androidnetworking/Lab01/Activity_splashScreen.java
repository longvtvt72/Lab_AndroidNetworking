package com.example.lab_androidnetworking.Lab01;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


import com.example.lab_androidnetworking.R;

public class Activity_splashScreen extends AppCompatActivity {
    private static int TIMEOUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        setTitle("Màn hình chào");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Activity_splashScreen.this, Bai2Activity.class);
                startActivity(intent);
                finish();

            }
        }, TIMEOUT);
    }
}