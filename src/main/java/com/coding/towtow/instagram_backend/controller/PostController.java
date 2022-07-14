package com.coding.towtow.instagram_backend.controller;

import com.coding.towtow.instagram_backend.entity.Post;
import com.coding.towtow.instagram_backend.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("post")
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public Post submitUserPost(@RequestBody Post post) {
        System.out.println("PostController.submitUserPost()");
        return postService.submitPost(post);
    }

    @GetMapping
    public ArrayList<Post> getAllPost() {
        System.out.println("PostController.getAllPost()");
        return postService.retrievePosts();
    }
}
