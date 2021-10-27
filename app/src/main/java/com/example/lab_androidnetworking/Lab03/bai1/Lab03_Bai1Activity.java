package com.example.lab_androidnetworking.Lab03.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.lab_androidnetworking.Lab03.bai1.GetContact;
import com.example.lab_androidnetworking.R;

public class Lab03_Bai1Activity extends AppCompatActivity {

    private ListView lvContact;

    GetContact getContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab03__bai1);
        lvContact = (ListView) findViewById(R.id.listContact);
        getContact = new GetContact(this,lvContact);
        getContact.execute();
    }
}