package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/")
    public List<String> getUsers(){
        List<String> list= Arrays.asList("user1","user2","user3");
        return list;
    }

    @GetMapping("/{id}/info")
    public String getUserInfo(){
        return "Nadeesha";
        }


}
