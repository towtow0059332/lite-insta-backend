package com.coding.towtow.instagram_backend.controller;

import com.coding.towtow.instagram_backend.entity.Comment;
import com.coding.towtow.instagram_backend.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("comment")
public class CommentController {
    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public Comment submitComment(@RequestBody Comment comment) {
        System.out.println("CommentController.submitComment()");
        return commentService.submitComment(comment);
    }

    @GetMapping("{postId}")
    public ArrayList<Comment> geAllCommentsForPost(@PathVariable("postId") String postId) {
        System.out.println("CommentController.geAllCommentsForPost()");
        return commentService.getAllCommentsForPost(postId);
    }
}
