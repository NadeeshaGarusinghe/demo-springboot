package com.example.springstartdemo.controller;

import com.example.springstartdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<String> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public String getUserInfo(Integer id){
        return userService.getUser(id);

        }


}
