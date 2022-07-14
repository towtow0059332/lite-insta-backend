package com.coding.towtow.instagram_backend.dto;

public class AvatarDto {
    private String userId;
    private String avatarURL;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public AvatarDto(String userId, String avatarURL) {
        this.userId = userId;
        this.avatarURL = avatarURL;
    }

    public AvatarDto() {
    }
}
