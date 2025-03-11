package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	
	private final UserRepository userRepo;
	
	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	public User getUserById(String id) {
		return userRepo.findById(id).orElseThrow(() -> new RuntimeException("Userd not found "+id));
	}

	public User getUserByEmail(String email) {
		return userRepo.findByEmail(email);
	}

	public List<User> getUsersByName(String name) {
		return userRepo.findByName(name);
	}

	public User createUser(User user) {
		return userRepo.save(user);
	}

	public User updateUser(String id, User user) {
		User existing = getUserById(id);
		existing.setEmail(user.getEmail());
		existing.setName(user.getName());
		return userRepo.save(existing);
	}

	public void deleteUser(String id) {
		userRepo.deleteById(id);
	}


}
