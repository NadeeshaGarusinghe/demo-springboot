package com.example.springstartdemo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl{
    public FoodServiceImpl(){
        System.out.print("Food Service Layer is created!");
    }
}
