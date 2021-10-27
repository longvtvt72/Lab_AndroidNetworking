package com.example.lab_androidnetworking.Lab05;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.lab_androidnetworking.R;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddProductActivity extends AppCompatActivity {
    private EditText edtName, edtPrice, edtDescription;
    private Button btnAdd;
    String strName,strPrice,strDes;
    CreateNewProductTask newProductTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        edtName = (EditText)findViewById(R.id.edtProductName_lab05);
        edtPrice = (EditText)findViewById(R.id.edtProductPrice_lab05);
        edtDescription = (EditText)findViewById(R.id.edtProductDes_lab05);
        btnAdd = (Button)findViewById(R.id.btnAdd_lab05);
        newProductTask = new CreateNewProductTask(this);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strName = edtName.getText().toString();
                strPrice = edtPrice.getText().toString();
                strDes = edtDescription.getText().toString();
                newProductTask.execute(strName,strPrice,strDes);
            }
        });
    }
}