package com.example.chatterboxlive.controller;

import com.example.chatterboxlive.model.User;
import com.example.chatterboxlive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public User getUser(@PathVariable String username) {
        return userService.findByUsername(username);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.saveUser(user);
    }
}
