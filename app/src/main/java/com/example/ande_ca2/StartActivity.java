package com.example.ande_ca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.signupbtn: // Sign Up Button
                intent = new Intent(StartActivity.this, SignUp1Activity.class);
                startActivity(intent);
                break;

            case R.id.loginbtn: // Log In Button
                intent = new Intent(StartActivity.this, LogInActivity.class);
                startActivity(intent);
                break;
        }
    }
}