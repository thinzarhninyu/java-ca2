package com.example.ande_ca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class RateTutorActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_tutor);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.ratebtn: // Okay Button
                Log.i("RateTutorActivity", "Okay clicked");
                intent = new Intent(RateTutorActivity.this, TutorHistoryActivity.class);
                startActivity(intent);
                break;

            case R.id.notnowbtn: // Not Now Button
                Log.i("RateTutorActivity", "Not now clicked");
                intent = new Intent(RateTutorActivity.this, TutorHistoryActivity.class);
                startActivity(intent);
                break;
        }
    }
}


