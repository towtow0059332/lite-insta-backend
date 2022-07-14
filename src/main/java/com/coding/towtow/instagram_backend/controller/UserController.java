package com.coding.towtow.instagram_backend.controller;

import com.coding.towtow.instagram_backend.dto.AvatarDto;
import com.coding.towtow.instagram_backend.entity.User;
import com.coding.towtow.instagram_backend.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
//@CrossOrigin
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User submitUser(@RequestBody User user) {
        System.out.println("UserController.submitUser()");
        System.out.println(user);
        return userService.submitMetadataOfUser(user);
    }

    @GetMapping("{userId}")
    public User getUserDetails(@PathVariable("userId") String userId) {
        System.out.println("PostController.getUserDetails()");
        return userService.displayMetadataOfUser(userId);
    }

    @PostMapping("avatar")
    public User updateAvatar(@RequestBody AvatarDto avatarDto) {
        System.out.println("PostController.updateAvatar()");
        System.out.println("userId: " + avatarDto.getUserId() + ", avatarUrl: " + avatarDto.getAvatarURL());
        return userService.updateAvatar(avatarDto.getUserId(), avatarDto.getAvatarURL());
    }
}
