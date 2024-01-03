package com.example.ande_ca2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DeleteActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(DeleteActivity.this, StartActivity.class);
        startActivity(intent);
    }
}



