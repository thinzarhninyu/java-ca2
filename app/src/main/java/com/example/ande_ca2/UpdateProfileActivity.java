package com.example.ande_ca2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class UpdateProfileActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(UpdateProfileActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}



