package com.samfieldhawb.linksorganiser.Models;

public class Link {
    public int mId, mCategoryId;
    public String mTitle;
    public String mUrl;

    public Link(int categoryId, String title, String url) {
        mCategoryId = categoryId;
        mTitle = title;
        mUrl = url;
    }

    public Link() {
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getCategoryId() {
        return mCategoryId;
    }

    public void setCategoryId(int categoryId) {
        mCategoryId = categoryId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }
}
