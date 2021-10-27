package com.example.lab_androidnetworking.Lab01;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_androidnetworking.R;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Bai1Activity extends AppCompatActivity implements View.OnClickListener{
    private Button button;
    private ImageView imageView;
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        setTitle("Màn hình chính");
        button = (Button) findViewById(R.id.buttonBai1);
        imageView = (ImageView) findViewById(R.id.imageViewBai1);
        tvMessage = (TextView) findViewById(R.id.tvMessage);
        button.setOnClickListener(this);
    }

    private Bitmap loadImage(String link){
        URL url;
        Bitmap bmp = null;
        try {
            url = new URL(link);
            bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());

        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return  bmp;
    }

    @Override
    public void onClick(View v) {
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                final Bitmap bitmap = loadImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRReNdrkZvPd0Hys4HWQFKa8BY26CFB67FJP2O8khaCddVArams8edGbXd6W7DLJin78Dc&usqp=CAU");
                imageView.post(new Runnable() {
                    @Override
                    public void run() {
                        tvMessage.setText("Image Dowloaded");
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
        });
        thread.start();
    }
}