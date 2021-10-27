package com.example.lab_androidnetworking.Lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lab_androidnetworking.R;

public class MainActivityLab05 extends AppCompatActivity {
    private Button btnViewProducts;
    private Button btnAddProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lab05);
        setTitle("Lab05_Web API");
        btnViewProducts = (Button) findViewById(R.id.btnViewProducts);
        btnAddProduct = (Button) findViewById(R.id.btnAddProduct);
        btnViewProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityLab05.this, AllProductsActivity.class);
                startActivity(intent);
            }
        });

        btnAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityLab05.this, AddProductActivity.class);
                startActivity(intent);
            }
        });
    }

}