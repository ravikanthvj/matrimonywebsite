package com.kalyanamastuapp.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalyanamastuapp.model.User;





public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByEmail(String email);
	 List<User> findAll();
}
