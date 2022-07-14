package com.coding.towtow.instagram_backend.repository;

import com.coding.towtow.instagram_backend.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
    Post save(Post post);

    ArrayList<Post> findAll();
}
