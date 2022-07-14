package com.coding.towtow.instagram_backend.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String userId;
    private String username;
    private String realName;
    private String profileImageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public User(String userId, String username, String realName, String profileImageUrl) {
        this.userId = userId;
        this.username = username;
        this.realName = realName;
        this.profileImageUrl = profileImageUrl;
    }

    public User(int id, String userId, String username, String realName, String profileImageUrl) {
        this.id = id;
        this.userId = userId;
        this.username = username;
        this.realName = realName;
        this.profileImageUrl = profileImageUrl;
    }

    public User() {
    }
}
