package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.mindrot.jbcrypt.BCrypt;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        User foundUser = userRepository.findByUsername(user.getUsername());
        if (foundUser != null && BCrypt.checkpw(user.getPassword(), foundUser.getPassword())) {
            return ResponseEntity.ok("Login successful");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        if(userRepository.findByUsername(user.getUsername()) != null) {
            return "User already exists";
        }
        userRepository.save(user);
        return "User registered successfully";

    }

}