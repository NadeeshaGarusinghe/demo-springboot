package com.example.springstartdemo.services.service;

import java.util.List;

public interface UserService {
    public List<String> getUsers();

    public String getUser(Integer id);


}


