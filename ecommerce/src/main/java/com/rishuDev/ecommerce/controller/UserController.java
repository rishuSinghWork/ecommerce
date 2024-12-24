package com.rishuDev.ecommerce.controller;

import com.rishuDev.ecommerce.entity.User;
import com.rishuDev.ecommerce.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
	private final UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		System.out.println("Print /users called with: " + user);
		return userRepository.save(user);
	}
}
