package com.example.lab_androidnetworking.Lab02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_androidnetworking.R;

public class Lab02_Bai1Activity extends AppCompatActivity implements View.OnClickListener {
    public static final String SEVER_NAME = "http://192.168.1.40:8080/hoten_massv/student_GET.php";

    private EditText edtName, edtScore;
    private Button btnSend;
    private TextView tvResult;

    String strName, strScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab02__bai1);
        edtName = (EditText) findViewById(R.id.editTextTextPersonNameL2B1);
        edtScore = (EditText) findViewById(R.id.editTextTextPersonName2L2B1);
        btnSend = (Button) findViewById(R.id.buttonL2B1);
        tvResult = (TextView) findViewById(R.id.textView2L2B1);
        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonL2B1:
                strName = edtName.getText().toString();
                strScore = edtScore.getText().toString();
                BackgroundTask_GET backgroundTask = new BackgroundTask_GET(this,tvResult,strName,strScore);
                backgroundTask.execute();
                break;
        }
    }
}