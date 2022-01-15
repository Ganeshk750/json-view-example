package com.example.jsonviewexample.user;

import com.example.jsonviewexample.view.View;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    @JsonView(View.Base.class)
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/all")
    @JsonView(View.Admin.class) // In Controller side we can't use multiple View like JsonView({View.Base.class, View.Admin.class})
    List<User> getAllDetails(){
        return userService.getUsers();
    }
}
