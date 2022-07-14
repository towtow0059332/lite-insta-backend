package com.coding.towtow.instagram_backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue
    private int id;
    private String commentId;
    private String userId;
    private String username;
    private String postId;
    private Timestamp timestamp;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
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

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comment(int id, String commentId, String userId, String username, String postId, Timestamp timestamp, String comment) {
        this.id = id;
        this.commentId = commentId;
        this.userId = userId;
        this.username = username;
        this.postId = postId;
        this.timestamp = timestamp;
        this.comment = comment;
    }

    public Comment() {
    }
}
