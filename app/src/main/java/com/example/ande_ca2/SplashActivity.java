package com.example.ande_ca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Launch the layout -> activity_splash.xml
        setContentView(R.layout.activity_splash);
        Thread splashThread = new Thread() {

            public void run() {
                try {
                    // sleep time in milliseconds (3000 = 3sec)
                    sleep(3000);
                } catch (InterruptedException e) {
                    // Trace the error
                    e.printStackTrace();
                } finally {
                    // Launch the StartActivity class
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        };
        // To Start the thread
        splashThread.start();
        }
    }