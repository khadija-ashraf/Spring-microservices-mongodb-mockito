//package com.example.MongoDemo;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.example.entity.User;
//import com.example.repository.UserRepository;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@SpringBootTest  // Start the full application for testing
//@AutoConfigureMockMvc
//public class UserControllerIT {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    private final ObjectMapper objectMapper = new ObjectMapper();
//
//    @BeforeEach
//    void setup() {
//        userRepository.deleteAll(); // Clean DB before each test
//    }
//
//    @Test
//    void testCreateAndRetrieveUser() throws Exception {
//        // Given
//        User user = new User( "Charlie", "c@m.com");
//
//        // When (Create User)
//        mockMvc.perform(post("/users/create")
//                .contentType("application/json")
//                .content(objectMapper.writeValueAsString(user)))
//                .andExpect(status().isOk());
//
//        // Then (Verify User Exists)
//        mockMvc.perform(get("/users/name/{name}"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.size()").value(1))
//                .andExpect(jsonPath("$[0].name").value("Charlie"));
//    }
//}