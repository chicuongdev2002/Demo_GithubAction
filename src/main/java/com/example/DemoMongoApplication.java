package com.example;

import com.example.enity.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoMongoApplication {
    @Autowired
private UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(DemoMongoApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(){
        return args -> {
            userRepository.save(new User("1","1234567890","John Doe"));
        };
    }

}
