package com.example.lab_androidnetworking.Lab02;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundTask_POST_2 extends AsyncTask<String, Void, Void> {
    String huongdan = Lab02_Bai3Activity.SEVER_NAME;
    Context context;
    TextView tv1;
    String strKetqua;
    ProgressDialog progress;


    public BackgroundTask_POST_2(Context context, TextView tv1) {
        this.context = context;
        this.tv1 = tv1;
    }



    @Override
    protected Void doInBackground(String... params) {
        try {
            URL url = new URL(huongdan);
            String param = "canh=" + URLEncoder.encode(params[0].toString(), "UTF-8");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setDoInput(true);
            urlConnection.setRequestMethod("POST");
            urlConnection.setFixedLengthStreamingMode(param.getBytes().length);
            urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            PrintWriter p = new PrintWriter(urlConnection.getOutputStream());
            p.print(param);
            p.close();


            BufferedReader bfr = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line = "";
            StringBuilder sb = new StringBuilder();
            while ((line = bfr.readLine()) != null){
                sb.append(line);
            }
            strKetqua = sb.toString();
            urlConnection.disconnect();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progress = new ProgressDialog(context);
        progress.setMessage("Calculating...");
        progress.setIndeterminate(false);
        progress.setCancelable(false);
        progress.show();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        if (progress.isShowing()){
            progress.dismiss();
        }
        tv1.setText(strKetqua);
    }



}
