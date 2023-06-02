package com.kalyanamastuapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalyanamastuapp.model.User;
import com.kalyanamastuapp.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	private final UserService userService;
	public UserController(UserService userService) {
        this.userService = userService;
    }
	
	@PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        Optional<User> existingUser = userService.findUserByEmail(user.getEmail());
        if (existingUser.isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        User savedUser = userService.registerUser(user);
        return ResponseEntity.ok(savedUser);
    }
	 @GetMapping("/{id}")
	    public User getUserById(@PathVariable("id") Long id) {
	        return userService.getUserById(id);
	    }
	 @GetMapping("/getAllUsers")
	    public List<User> getUserById() {
	        return userService.getAllUsers();
	    }
	 
}
