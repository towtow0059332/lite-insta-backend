package com.coding.towtow.instagram_backend.service;

import com.coding.towtow.instagram_backend.entity.Post;
import com.coding.towtow.instagram_backend.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@Service
public class PostService {
    private PostRepository postRepository;
    private UserService userService;

    public PostService(PostRepository postRepository, UserService userService) {
        this.postRepository = postRepository;
        this.userService = userService;
    }

    public Post submitPost(Post post) {
        return postRepository.save(post);
    }

    public ArrayList<Post> retrievePosts() {
        ArrayList<Post> posts = postRepository.findAll();
        for (Post post : posts) {
            post.setUsername(userService.displayMetadataOfUser(post.getUserId()).getUsername());
        }
//        todo
        posts.sort(Comparator.comparingInt(Post::getId).reversed());
//        posts.sort((p1,p2)-> p1.getId()-p2.getId());
//        Collections.sort(posts,(p1,p2)-> p1.getId()- p2.getId());
        return posts;
    }
}
