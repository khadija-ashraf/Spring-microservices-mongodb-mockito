package com.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	User findByEmail(String email);
	List<User> findByName(String name);
}
