//package com.example.MongoDemo;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.util.List;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
//import org.springframework.test.context.ContextConfiguration;
//
//import com.example.entity.User;
//import com.example.repository.UserRepository;
//
//@DataMongoTest  // Loads only MongoDB-related components
//@ContextConfiguration(classes = TestMongoConfig.class) // Use TestContainers config
//public class UserRepositoryTest {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @BeforeEach
//    void setup() {
//        userRepository.deleteAll(); // Clean database before each test
//    }
//
//    @AfterEach
//    void tearDown() {
//        userRepository.deleteAll(); // Clean database after each test
//    }
//
//    @Test
//    void testSaveAndFindUser() {
//        // Given
//        User user = new User("Alice", "a@m.com");
//        userRepository.save(user);
//
//        // When
//        List<User> users = userRepository.findByName("Alice");
//
//        // Then
//        assertThat(users).hasSize(1);
//        assertThat(users.get(0).getName()).isEqualTo("Alice");
//    }
//
//    @Test
//    void testFindUserByNonExistentCity() {
//        // When
//        User users = userRepository.findByEmail("Los Angeles");
//
//        // Then
//        assertThat(users).isNull();
//    }
//}
