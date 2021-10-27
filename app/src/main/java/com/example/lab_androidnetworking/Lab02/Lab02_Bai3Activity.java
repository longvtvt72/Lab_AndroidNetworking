package com.example.lab_androidnetworking.Lab02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_androidnetworking.R;

public class Lab02_Bai3Activity extends AppCompatActivity implements View.OnClickListener {
    public static final String SEVER_NAME = "http://192.168.1.40:8080/hoten_massv/canh_POST.php";

    private EditText editTextTextPersonName;
    private Button btn;
    private TextView tv1;

    String strCanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab02__bai3);
        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        btn = (Button) findViewById(R.id.btn);
        tv1 = (TextView) findViewById(R.id.tv1);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                strCanh = editTextTextPersonName.getText().toString();
                BackgroundTask_POST_2 post_2 = new BackgroundTask_POST_2(this,tv1);
                post_2.execute(strCanh);
                break;
        }
    }
}