package com.example.ande_ca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUp1Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_1);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(SignUp1Activity.this, SignUp2Activity.class);
        startActivity(intent);
    }
}


