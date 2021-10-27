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

public class BackgroundTask_POST extends AsyncTask<Void, Void, Void> {
    String duongdan = Lab02_Bai2Activity.SEVER_NAME;
    Context context;
    String strWidth, strLength;
    TextView tvResult;
    String strResult;
    ProgressDialog pDialog;

    public BackgroundTask_POST(Context context, String strWidth, String strLength, TextView tvResult) {
        this.context = context;
        this.strWidth = strWidth;
        this.strLength = strLength;
        this.tvResult = tvResult;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pDialog = new ProgressDialog(context);
        pDialog.setMessage("Calculating...");
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(false);
        pDialog.show();
    }



    @Override
    protected Void doInBackground(Void... params) {
        try {
            URL url = new URL(duongdan);
            String param = "chieurong=" + URLEncoder.encode(strWidth, "utf-8")+ "&chieudai="
                    + URLEncoder.encode(strLength, "utf-8");
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.setRequestMethod("POST");
            urlConnection.setFixedLengthStreamingMode(param.getBytes().length);
            urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            PrintWriter print = new PrintWriter(urlConnection.getOutputStream());
            print.print(param);
            print.close();

            String line = "";
            BufferedReader bfr = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            StringBuffer sb = new StringBuffer();
            while ((line = bfr.readLine()) != null){
                sb.append(line);
            }
            strResult = sb.toString();
            urlConnection.disconnect();
        }catch (Exception ex){

        }
        return null;
    }

    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);
        if(pDialog.isShowing()){
            pDialog.dismiss();
        }
        tvResult.setText(strResult);
    }
}
