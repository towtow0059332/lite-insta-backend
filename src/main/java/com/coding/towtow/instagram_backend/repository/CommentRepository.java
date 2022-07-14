package com.coding.towtow.instagram_backend.repository;

import com.coding.towtow.instagram_backend.entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {
    Comment save(Comment comment);

    ArrayList<Comment> findAllByPostId(String postId);
}
