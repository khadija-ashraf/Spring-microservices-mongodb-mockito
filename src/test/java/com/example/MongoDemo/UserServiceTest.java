package com.example.MongoDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserServiceImpl;

@SpringBootTest
public class UserServiceTest {
	
	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private UserServiceImpl userServiceImpl;
	
	@Test
	void testGetUserById() {
		String id = "1";
		String name = "John Doe";
		String email = "john@gmail.com";
		User user = new User(name, email);
		user.setId(id);
		
		when(userRepository.findById(id)).thenReturn(Optional.of(user));
		
		User result = userServiceImpl.getUserById(id);
		assertNotNull(result);
		assertEquals(result.getName(), user.getName());
		
	}
}
