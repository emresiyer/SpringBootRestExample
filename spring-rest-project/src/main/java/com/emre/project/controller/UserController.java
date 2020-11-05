package com.emre.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emre.project.model.User;
import com.emre.project.repository.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository; 

	@PostMapping("create")
	public String createUser(@RequestBody User user) {
		userRepository.save(new User(user.getUsername(), user.getPassword(), user.getName(), user.getEmail()));
		return "User Created";
	}

	@RequestMapping("update")
	public String updateUser() {
		return "User Updated";
	}

	@RequestMapping("delete")
	public String deleteUser() {
		return "User Deleted";
	}
	
	@GetMapping("findAll")
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}
}
