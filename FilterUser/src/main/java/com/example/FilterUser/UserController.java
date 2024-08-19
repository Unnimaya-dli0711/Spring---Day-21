package com.example.FilterUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository=new UserRepository();
    @GetMapping("/users/filter")
    public List<User> filterUsers(
            @RequestParam (required = false) Integer age,
            @RequestParam (required = false) String city
    ){
        return userRepository.findByAgeCity(age,city);
    }
}
