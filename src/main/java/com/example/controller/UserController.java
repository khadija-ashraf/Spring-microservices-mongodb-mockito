package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;
import com.example.entity.User;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
//		super();
		this.userService = userService;
	}
	
	@GetMapping("/{id}")
	public User getAllUserById(@PathVariable String id){
		return userService.getUserById(id);
	}
	
	@GetMapping("/name/{name}")
	public List<User> getAllUsersByName(@PathVariable String name){
		return userService.getUsersByName(name);
	}
	
	@GetMapping("/email/{email}")
	public User getUserByEmail(@PathVariable String email) {
		return userService.getUserByEmail(email);
	}
	
	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		userService.createUser(user);
		return ResponseEntity.status(HttpStatusCode.valueOf(HttpStatus.CREATED.value()))
				.body(user);
	}
	
	@PostMapping("/update/{id}")
	public User updateUser(@PathVariable String id, @RequestBody User user) {
		return userService.updateUser(id, user);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUserById(@PathVariable String id) {
		userService.deleteUser(id);
	}
}
