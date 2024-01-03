package com.example.ande_ca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AllTutorsActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_tutors);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(AllTutorsActivity.this, SearchActivity.class);
        startActivity(intent);
    }
}


