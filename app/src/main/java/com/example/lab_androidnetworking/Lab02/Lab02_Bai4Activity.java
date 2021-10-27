package com.example.lab_androidnetworking.Lab02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_androidnetworking.R;

public class Lab02_Bai4Activity extends AppCompatActivity {

    EditText edt_unknown_a, edt_unknown_b, edt_unknown_c;
    Button btn_result;
    TextView tv_result;

    public static final String SERVER_NAME="http://192.168.1.40:8080/hoten_massv/giaiphuongtrinh_POST.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab02__bai4);
        edt_unknown_a = findViewById(R.id.edtA);
        edt_unknown_b = findViewById(R.id.edtB);
        edt_unknown_c = findViewById(R.id.edtC);
        btn_result = findViewById(R.id.buttonL2B4);
        tv_result = findViewById(R.id.textView2L2B4);

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Invoke AsyncTask
                String a = edt_unknown_a.getText().toString().trim();
                String b = edt_unknown_b.getText().toString().trim();
                String c = edt_unknown_c.getText().toString().trim();
                BackgroundTask_POST_3 quadraticEquation = new BackgroundTask_POST_3(Lab02_Bai4Activity.this, a,b,c,tv_result );
                quadraticEquation.execute();
            }
        });
    }
}