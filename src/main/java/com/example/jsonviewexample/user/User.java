package com.example.jsonviewexample.user;

import com.example.jsonviewexample.view.View;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(View.Admin.class)
    private long id;

    @JsonView({View.Base.class,View.Admin.class})
    private String username;

    @JsonView({View.Base.class,View.Admin.class})
    private String email;
    private String password;

    @JsonView(View.Admin.class)
    private String role;

    @JsonView(View.Admin.class)
    private String auth;

    // In entity we can use multiple view
}
