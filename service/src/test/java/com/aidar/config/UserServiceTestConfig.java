package com.aidar.config;

import com.aidar.repository.UserRepository;
import com.aidar.service.SecurityService;
import com.aidar.service.UserService;
import com.aidar.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.mockito.Mockito.mock;

@Configuration
public class UserServiceTestConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public UserRepository userRepository() {
        return mock(UserRepository.class);
    }

    @Bean
    public SecurityService securityService() {
        return mock(SecurityService.class);
    }

}
