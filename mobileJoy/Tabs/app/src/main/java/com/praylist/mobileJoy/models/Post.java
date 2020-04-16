package com.praylist.mobileJoy.models;


public class Post {


    private String postKey;
    private String title;   // 마가복음...
    private String description; // 예수께서...
    private String date;

    public Post(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

   // make sure to have an empty constructor inside ur model class
    public Post() {
    }


    public String getPostKey() {
        return postKey;
    }

    public void setPostKey(String postKey) {
        this.postKey = postKey;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
