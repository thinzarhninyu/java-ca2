package com.example.ande_ca2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(int position, Class<?> page);
    }
    private List<SettingsItem> settingsItemList;
    private OnItemClickListener onItemClickListener;

    public SettingsAdapter(List<SettingsItem> settingsItemList, OnItemClickListener onItemClickListener) {
        this.settingsItemList = settingsItemList;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_settings, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SettingsItem item = settingsItemList.get(position);
        holder.textView.setText(item.getItemName());
        holder.imageView.setImageResource(item.getIconResource());
        holder.imageButton.setOnClickListener(v -> {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(position, item.getPage());
            }
        });
    }

    @Override
    public int getItemCount() {
        return settingsItemList.size();
    }

        static class ViewHolder extends RecyclerView.ViewHolder {
            TextView textView;
            ImageView imageView;
            ImageButton imageButton;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                textView = itemView.findViewById(R.id.itemname);
                imageView = itemView.findViewById(R.id.itemicon);
                imageButton = itemView.findViewById(R.id.itembtn);
            }
        }
    }
