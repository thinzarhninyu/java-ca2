package com.example.ande_ca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.button2: // Log In Button
                intent = new Intent(LogInActivity.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.button3: // Sign Up Button
                intent = new Intent(LogInActivity.this, SignUp1Activity.class);
                startActivity(intent);
                break;
        }
    }
}


