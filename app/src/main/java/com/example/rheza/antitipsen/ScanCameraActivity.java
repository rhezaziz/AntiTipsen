package com.example.rheza.antitipsen;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.json.JSONException;
import org.json.JSONObject;

public class ScanCameraActivity extends AppCompatActivity implements View.OnClickListener{

    Button scan;
   // TextView nama;
    private IntentIntegrator intentIntegrator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_camera);
        scan = findViewById(R.id.QR);
       // nama = findViewById(R.id.textViewNama);
        scan.setOnClickListener(this);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null){
            if(result.getContents() == null){
                Toast.makeText(this , "Hasil tidak ditemukan", Toast.LENGTH_LONG).show();
            }else{
                try {
                    JSONObject object = new JSONObject(result.getContents());

                }catch (JSONException e){
                    e.printStackTrace();
                    Toast.makeText(this , result.getContents(), Toast.LENGTH_LONG).show();
                }
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void onClick(View v) {
        intentIntegrator = new IntentIntegrator(this);
        intentIntegrator.initiateScan();
    }
}
