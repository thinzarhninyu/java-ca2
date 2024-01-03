package com.example.ande_ca2;

public class SettingsItem {
    private String itemName;
    private int iconResource;
    private Class<?> page;

    public SettingsItem(String itemName, int iconResource, Class<?> page) {
        this.itemName = itemName;
        this.iconResource = iconResource;
        this.page = page;
    }

    public String getItemName() {
        return itemName;
    }

    public int getIconResource() {
        return iconResource;
    }

    public Class<?> getPage() {
        return page;
    }
}
