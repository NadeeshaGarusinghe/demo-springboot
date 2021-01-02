package com.example.springstartdemo.impl;

import com.example.springstartdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private List<String> list=new ArrayList<String>();

    public UserServiceImpl(){
        System.out.println("User Service Layer is created!");
        list.add("Nadeesha");
        list.add("Sadil");
        list.add("Nipun");
    }

    public List<String> getUsers(){
        return list;
    }

    public String getUser(Integer id){
        return "Nadeesha";
    }
}
