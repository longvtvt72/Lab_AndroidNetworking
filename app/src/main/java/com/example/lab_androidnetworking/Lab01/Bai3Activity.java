package com.example.lab_androidnetworking.Lab01;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_androidnetworking.R;

public class Bai3Activity extends AppCompatActivity implements View.OnClickListener,Listener {
    private Button button;
    private ImageView imageView;
    private TextView tvMessage;

    public static final String IMAGE_URL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRReNdrkZvPd0Hys4HWQFKa8BY26CFB67FJP2O8khaCddVArams8edGbXd6W7DLJin78Dc&usqp=CAU";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        setTitle("Bài 3");
        button = (Button) findViewById(R.id.buttonBai3);
        imageView = (ImageView) findViewById(R.id.imageViewBai3);
        tvMessage = (TextView) findViewById(R.id.tvMessage3);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()){
            case R.id.buttonBai3:
                new LoadImageTask( this, this).execute(IMAGE_URL);
                break;
        }
    }
    public void onImageLoaded(Bitmap bitmap){
        imageView.setImageBitmap(bitmap);
        tvMessage.setText("Image Dowloaded");
    }
    public void onError(){
        tvMessage.setText("Error Dowload Image");
    }
}