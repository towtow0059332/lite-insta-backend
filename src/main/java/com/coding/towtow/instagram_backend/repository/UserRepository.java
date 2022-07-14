package com.coding.towtow.instagram_backend.repository;

import com.coding.towtow.instagram_backend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User save(User user);

    User findByUserId(String userId);
}
