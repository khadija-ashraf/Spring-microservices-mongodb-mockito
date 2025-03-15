package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document (collection = "users")
public class User {
	
	@Id
	private String id;
	
	@NonNull
	private String name;
	
	@NonNull
	private String email;
	
	public User() {}

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public User(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
