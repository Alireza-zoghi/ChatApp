package com.alirezazoghi.chatapp.Model;

public class User {

    private String id;
    private String userName;
    private String imageUrl;
    private String status;
    private String search;

    public User(String id, String username, String imageUrl, String status, String search) {
        this.id = id;
        this.status = status;
        this.userName = username;
        this.imageUrl = imageUrl;
        this.search = search;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSearch() {
        return search;
    }
}
