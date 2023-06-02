package com.kalyanamastuapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kalyanamastuapp.model.User;
import com.kalyanamastuapp.repo.UserRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
@Service
public class UserService {
	private final UserRepository userRepository;
	 @Autowired
	 private PasswordEncoder passwordEncoder;
	public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
	public User updateUser(User user) {
        return userRepository.save(user);
    }
	public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public void deleteUser(User user) {
        userRepository.delete(user);
    }
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
    	user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
