package com.example.jsonviewexample;

import com.example.jsonviewexample.user.User;
import com.example.jsonviewexample.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.IntStream;

@SpringBootApplication
public class JsonViewExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonViewExampleApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserRepository userRepository){
        return args -> IntStream.rangeClosed(1,30).forEach( i ->{
            User user = new User();
            user.setUsername("user" + i);
            user.setEmail("user" + i + "@gmail.com");
            user.setPassword("password" + i);
            user.setRole("role"+ i);
            user.setAuth("auth"+ i);
            userRepository.save(user);
        });
    }
}
