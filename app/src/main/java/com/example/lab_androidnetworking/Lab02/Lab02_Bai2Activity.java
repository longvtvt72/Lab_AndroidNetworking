package com.example.lab_androidnetworking.Lab02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_androidnetworking.R;

public class Lab02_Bai2Activity extends AppCompatActivity implements View.OnClickListener {
    public static final String SEVER_NAME = "http://192.168.1.40:8080/hoten_massv/rectangle_POST.php";

    private EditText edtWitdh, edtLength;
    private Button btnSend;
    private TextView tvResult;

    String strWidth, strLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab02__bai2);
        edtWitdh = (EditText) findViewById(R.id.editTextTextPersonNameL2B2);
        edtLength = (EditText) findViewById(R.id.editTextTextPersonName2L2B2);
        btnSend = (Button) findViewById(R.id.buttonL2B2);
        tvResult = (TextView) findViewById(R.id.textView2L2B2);
        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonL2B2:
                strWidth = edtWitdh.getText().toString();
                strLength = edtLength.getText().toString();
                BackgroundTask_POST backgroundTask_post = new BackgroundTask_POST(this,strWidth,strLength,tvResult);
                backgroundTask_post.execute();
                break;
        }
    }
}