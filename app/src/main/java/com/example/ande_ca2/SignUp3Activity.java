package com.example.ande_ca2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp3Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_3);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(SignUp3Activity.this, MainActivity.class);
        startActivity(intent);
    }
}


