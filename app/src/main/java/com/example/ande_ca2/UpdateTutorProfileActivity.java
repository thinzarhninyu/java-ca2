package com.example.ande_ca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class UpdateTutorProfileActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_tutor_profile);

        Spinner moduleSpinner = findViewById(R.id.module);
        String[] moduleOptions = {"Singapore Polytechnic", "Republic Polytechnic", "Temasek Polytechnic", "Ngee Ann Polytechnic", "Nanyang Polytechnic"};
        ArrayAdapter<String> moduleAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, moduleOptions);
        moduleAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        moduleSpinner.setAdapter(moduleAdapter);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(UpdateTutorProfileActivity.this, TutorProfileActivity.class);
        startActivity(intent);
    }
}


