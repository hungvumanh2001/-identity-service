package com.example.identity_service.controller;

import com.example.identity_service.dto.request.UserCreationRequest;
import com.example.identity_service.dto.response.UserResponse;
import com.example.identity_service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

@Slf4j
@SpringBootTest
@AutoConfigureMockMvc   //giup tao mock request toi controller
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    private UserCreationRequest request;    //mock request
    private UserResponse userResponse;  //mock response
    private LocalDate dob;

    @BeforeEach
    void initData() {   //ham khoi tao data chay truoc method test
        dob = LocalDate.of(1990, 1, 1);

        request = UserCreationRequest.builder()
                .username("john")
                .firstName("John")
                .lastName("Doe")
                .password("12345678")
                .dob(dob)
                .build();

        userResponse = UserResponse.builder()
                .id("cf0600f538b3")
                .username("john")
                .firstName("John")
                .lastName("Doe")
                .dob(dob)
                .build();
    }

    @Test
    void createUser(){
        log.info("Creating user");
    }
}
