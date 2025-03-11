package com.example.MongoDemo;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;
// Import for status(), jsonPath()
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.example.controller.UserController;
import com.example.entity.User;
import com.example.service.UserService;

@WebMvcTest(UserController.class)
public class UserControllerTest {

	@Autowired
    private MockMvc mockMvc;

	@MockBean
    private UserService userService;

    @Test
    void testGetUserById() throws Exception {
        when(userService.getUserById("1")).thenReturn(new User("1", "John Doe", "john@gmail.com"));

        mockMvc.perform(get("/users/1"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.id").value(1))
               .andExpect(jsonPath("$.name").value("John Doe"))
               .andExpect(jsonPath("$.email").value("john@gmail.com"));
    }
	
    @Test
    void testCreateUser() throws Exception {
        String userJson = "{\"name\": \"Jane Doe\", \"email\": \"jane@gmail.com\"}";

        ResultActions resultActions = mockMvc.perform(post("/users/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson))
//        		.andDo(print())
        		.andDo(log())
               .andExpect(status().isCreated())
               .andExpect(jsonPath("$.name").value("Jane Doe"));
        
//        resultActions.andDo(new ResultHandler() {
//
//			@Override
//			public void handle(MvcResult result) throws Exception {
//				System.out.println("Request URI: " + result.getRequest().getRequestURI());
//			    System.out.println("Request Method: " + result.getRequest().getMethod());
//			    System.out.println("Request Headers: " + result.getRequest().getHeader("Custom-Header"));
//			}
//        	
//        });
        
    }
	
}
