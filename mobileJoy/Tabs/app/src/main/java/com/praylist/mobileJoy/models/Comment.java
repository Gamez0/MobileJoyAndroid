package com.praylist.mobileJoy.models;

public class Comment {

    private String content;
    private String username;
    private Object timestamp;


    public Comment() {
    }

    public Comment(String content, String uname) {
        this.content = content;
        this.username = uname;
    }

    public Comment(String content, String uname, Object timestamp) {
        this.content = content;
        this.username = uname;
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Object timestamp) {
        this.timestamp = timestamp;
    }
}
