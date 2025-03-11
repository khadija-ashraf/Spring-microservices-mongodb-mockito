package com.example.service;

import java.util.List;

import com.example.entity.User;

public interface UserService {
	List<User> getAllUsers();
	
	User getUserById(String id);
	User getUserByEmail(String email);
	List<User> getUsersByName(String name);
	
	User createUser(User user);
	User updateUser(String id, User user);
	void deleteUser(String Id);
	
}
