package com.example.rheza.antitipsen;

import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//Button login;
    CardView cvScan;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        cvScan = findViewById(R.id.cvScan);
        cvScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScanCameraActivity.class);
                startActivity(intent);
            }
        });
        
        //login = findViewById(R.id.login);

//         login.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View v) {
//                 Intent intent = new Intent(MainActivity.this, ScanCameraActivity.class);
//                 startActivity(intent);
//             }
//         });
    }
}
