package com.samfieldhawb.linksorganiser.Models;

public class Category {
    public int mId;
    public String mIcon_name;
    public String mName;

    public Category(String icon_name, String name) {
        mIcon_name = icon_name;
        mName = name;
    }

    public Category() {
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getIcon_name() {
        return mIcon_name;
    }

    public void setIcon_name(String icon_name) {
        mIcon_name = icon_name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
