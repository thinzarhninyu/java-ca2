package com.example.ande_ca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TutorProfileActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_profile);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(TutorProfileActivity.this, UpdateTutorProfileActivity.class);
        startActivity(intent);
    }
}


