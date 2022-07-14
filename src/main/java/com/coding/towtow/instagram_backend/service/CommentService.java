package com.coding.towtow.instagram_backend.service;

import com.coding.towtow.instagram_backend.entity.Comment;
import com.coding.towtow.instagram_backend.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentService {
    private CommentRepository commentRepository;
    private UserService userService;

    public CommentService(CommentRepository commentRepository, UserService userService) {
        this.commentRepository = commentRepository;
        this.userService = userService;
    }

    public Comment submitComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public ArrayList<Comment> getAllCommentsForPost(String postId) {
        ArrayList<Comment> comments = commentRepository.findAllByPostId(postId);
        for (Comment comment : comments) {
            comment.setUsername(userService.displayMetadataOfUser(comment.getUserId()).getUsername());
        }
        return comments;
    }
}
