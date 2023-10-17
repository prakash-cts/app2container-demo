package com.example.demo.usecase1;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 868065
 */
@RestController
public class LoginController {
    @Autowired
    private UserDetailsRepository repository;
    @GetMapping
    public String getLoginMessage(){
        return "Hello World";
    }
    @GetMapping("/users")
    public List<UserDetails> getUserDetails(){
        return repository.findAll();
    }
    @PostMapping("/users")
    public UserDetails saveUserDetails(@RequestParam(value = "name") String name){
        return repository.save(new UserDetails(name));
    }
}
