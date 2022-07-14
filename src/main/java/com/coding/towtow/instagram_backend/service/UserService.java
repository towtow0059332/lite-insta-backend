package com.coding.towtow.instagram_backend.service;

import com.coding.towtow.instagram_backend.entity.User;
import com.coding.towtow.instagram_backend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User submitMetadataOfUser(User user) {
        return userRepository.save(user);
    }

    public User displayMetadataOfUser(String userId) {
        return userRepository.findByUserId(userId);
    }

    public User updateAvatar(String userId, String avatarUrl) {
        User user = userRepository.findByUserId(userId);
        user.setProfileImageUrl(avatarUrl);
        return userRepository.save(user);
    }
}
