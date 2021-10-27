package com.example.lab_androidnetworking.Lab01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_androidnetworking.R;

public class Bai4Activity extends AppCompatActivity implements View.OnClickListener {
    private Button btnRun;
    private EditText edtTime;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        setTitle("Bài 4");
        btnRun = (Button) findViewById(R.id.buttonBai4);
        edtTime = (EditText) findViewById(R.id.editText4);
        tvResult = (TextView) findViewById(R.id.textView4);
        btnRun.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonBai4:
                AsyncTaskRunner asyncTaskRunner= new AsyncTaskRunner(this,tvResult,edtTime);
                String sleepTime = edtTime.getText().toString();
                asyncTaskRunner.execute(sleepTime);
                break;
        }
    }
}