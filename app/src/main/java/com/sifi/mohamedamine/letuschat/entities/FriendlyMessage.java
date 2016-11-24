package com.sifi.mohamedamine.letuschat.entities;

public class FriendlyMessage {

    private String mText;
    private String mName;
    private String mPhotoUrl;

    public FriendlyMessage(String text, String name, String photoUrl) {
        mText = text;
        mName = name;
        mPhotoUrl = photoUrl;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPhotoUrl() {
        return mPhotoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        mPhotoUrl = photoUrl;
    }
}
