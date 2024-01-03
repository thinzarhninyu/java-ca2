package com.example.ande_ca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Spinner schoolSpinner = findViewById(R.id.searchSchool);
        String[] schoolOptions = {"Singapore Polytechnic", "Republic Polytechnic", "Temasek Polytechnic", "Ngee Ann Polytechnic", "Nanyang Polytechnic"};
        ArrayAdapter<String> schoolAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, schoolOptions);
        schoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        schoolSpinner.setAdapter(schoolAdapter);

        Spinner courseSpinner = findViewById(R.id.searchCourse);
        String[] courseOptions = {"Singapore Polytechnic", "Republic Polytechnic", "Temasek Polytechnic", "Ngee Ann Polytechnic", "Nanyang Polytechnic"};
        ArrayAdapter<String> courseAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, courseOptions);
        courseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        courseSpinner.setAdapter(courseAdapter);

        Spinner yearSpinner = findViewById(R.id.searchYear);
        String[] yearOptions = {"Year 1", "Year 2", "Year 3"};
        ArrayAdapter<String> yearAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, yearOptions);
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearSpinner.setAdapter(yearAdapter);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(SearchActivity.this, SearchResultsActivity.class);
        startActivity(intent);
    }
}


