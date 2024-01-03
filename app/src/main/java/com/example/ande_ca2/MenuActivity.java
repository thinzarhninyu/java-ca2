package com.example.ande_ca2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MyTag", "This is in MenuActivity.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_navigation_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_home:
                Log.d("MyTag", "This is in Home.");
                openActivity(MainActivity.class);
                return true;
            case R.id.menu_search:
                Log.d("MyTag", "This is in Search.");
                openActivity(SearchActivity.class);
                return true;
            case R.id.menu_notifications:
                Log.d("MyTag", "This is in Notifications.");
                openActivity(ComingSoonActivity.class);
                return true;
            case R.id.menu_profile:
                Log.d("MyTag", "This is in Settings.");
                openActivity(SettingsActivity.class);
                return true;
            default:
                Log.d("MyTag", "This is Default.");
                return super.onOptionsItemSelected(item);
        }
    }

    private void openActivity(Class<?> activityClass) {
        Log.d("MyTag", "This is in openActivity.");
        Intent intent = new Intent(MenuActivity.this, activityClass);
        startActivity(intent);
    }
}