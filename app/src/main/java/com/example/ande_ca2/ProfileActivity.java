package com.example.ande_ca2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ProfileActivity.this, UpdateProfileActivity.class);
        startActivity(intent);
    }
}



