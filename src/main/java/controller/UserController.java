package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/get")
public class UserController {

    @GetMapping("/user")
    public String getUser(){
        return "Nadeesha";
    }

    @GetMapping("/allusers")
    public List<String> getList(){
        List<String> list= Arrays.asList("user1","user2","user3");
        return list;

    }
}
