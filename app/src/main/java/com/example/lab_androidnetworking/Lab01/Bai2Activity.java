package com.example.lab_androidnetworking.Lab01;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_androidnetworking.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Bai2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private ProgressDialog progressDialog;
    private String url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRReNdrkZvPd0Hys4HWQFKa8BY26CFB67FJP2O8khaCddVArams8edGbXd6W7DLJin78Dc&usqp=CAU";
    private Bitmap bitmap = null;
    private ImageView imageView;
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        setTitle("Màn hình chính");
        button = (Button) findViewById(R.id.buttonBai2);
        imageView = (ImageView) findViewById(R.id.imageViewBai2);
        tvMessage = (TextView) findViewById(R.id.tvMessage2);
        button.setOnClickListener(this);
    }

    private Handler messageHandler = new Handler(){
        public void handleMessage(Message msg){
            super.handleMessage(msg);
            Bundle bundle = msg.getData();
            String message = bundle.getString("Message");
            tvMessage.setText(message);
            imageView.setImageBitmap(bitmap);
            progressDialog.dismiss();
        }
    };

    private Bitmap loadImage (String link){
        URL url;
        Bitmap bmp = null;
        try {
            url = new URL(link);
            bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());

        }catch (MalformedURLException e ){
            e.printStackTrace();
        }catch (IOException e ){
            e.printStackTrace();
        }
        return bmp;
    }

    @Override
    public void onClick(View v) {
        progressDialog = ProgressDialog.show(Bai2Activity.this,"","Dowloading ....");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                bitmap = dowloadBitmap(url);
                Message message = messageHandler.obtainMessage();
                Bundle bundle = new Bundle();
                String threadMessage = "Image Download Successfully";
                bundle.putString("Message", threadMessage);
                message.setData(bundle);
                messageHandler.sendMessage(message);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

    private Bitmap dowloadBitmap(String link){
        try {
            URL url = new URL(link);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            InputStream inputStream = connection.getInputStream();
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            return bitmap;

        }catch (MalformedURLException e ){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}