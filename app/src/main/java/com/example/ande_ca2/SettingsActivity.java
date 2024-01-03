package com.example.ande_ca2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener, SettingsAdapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        setupRecyclerView(R.id.settingsAccountRecyclerView, getAccountItems());
        setupRecyclerView(R.id.settingsTutorsRecyclerView, getTutorsItems());
        setupRecyclerView(R.id.settingsMoreRecyclerView, getMoreItems());
    }

    private void setupRecyclerView(int recyclerViewId, List<SettingsItem> items) {
        RecyclerView recyclerView = findViewById(recyclerViewId);
        SettingsAdapter adapter = new SettingsAdapter(items, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<SettingsItem> getAccountItems() {
        List<SettingsItem> accountItems = new ArrayList<>();

        String[] itemNames = {"Profile", "Password", "Notifications", "Tutor History", "Delete Account"};
        int[] itemIcons = {R.drawable.profile, R.drawable.home, R.drawable.notif, R.drawable.home, R.drawable.home};
        Class<?>[] itemActivities = {ProfileActivity.class, UpdatePassword1Activity.class, ComingSoonActivity.class, TutorHistoryActivity.class, DeleteActivity.class};

        for (int i = 0; i < itemNames.length; i++) {
            accountItems.add(new SettingsItem(itemNames[i], itemIcons[i], itemActivities[i]));
        }

        return accountItems;
    }

    private List<SettingsItem> getTutorsItems() {
        List<SettingsItem> tutorsItems = new ArrayList<>();

        String[] itemNames = {"Tutor"};
        int[] itemIcons = {R.drawable.profile};
        Class<?>[] itemActivities = {TutorRegisterActivity.class};

        for (int i = 0; i < itemNames.length; i++) {
            tutorsItems.add(new SettingsItem(itemNames[i], itemIcons[i], itemActivities[i]));
        }

        return tutorsItems;
    }

    private List<SettingsItem> getMoreItems() {
        List<SettingsItem> moreItems = new ArrayList<>();

        String[] itemNames = {"Personalisation", "Help"};
        int[] itemIcons = {R.drawable.profile, R.drawable.home};
        Class<?>[] itemActivities = {ComingSoonActivity.class, ComingSoonActivity.class};

        for (int i = 0; i < itemNames.length; i++) {
            moreItems.add(new SettingsItem(itemNames[i], itemIcons[i], itemActivities[i]));
        }

        return moreItems;
    }
    @Override
    public void onItemClick(int position, Class<?> page) {
        Intent intent = new Intent(SettingsActivity.this, page);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(SettingsActivity.this, StartActivity.class);
        startActivity(intent);
    }
}
