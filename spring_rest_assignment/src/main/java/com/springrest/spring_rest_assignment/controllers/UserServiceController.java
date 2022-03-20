package com.springrest.spring_rest_assignment.controllers;

import java.util.List;

import com.springrest.spring_rest_assignment.models.User;
import com.springrest.spring_rest_assignment.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {
    @Autowired
	private UserService all_users;

    @GetMapping("/users")
    public UserService getAll_users() {
        return all_users;
    }

    @GetMapping("/allusers")
    public List<User> getUser() {
        return all_users.getUsers();
    }

    @PostMapping("/admin")
    public String validateUser(@RequestBody User newUser){

        return all_users.validateUsers(newUser.getUsername(), newUser.getPassword());

    }
    
}
