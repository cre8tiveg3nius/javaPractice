package com.mooredemo.app.restdemo.Controller;

import com.mooredemo.app.restdemo.Models.User;
import com.mooredemo.app.restdemo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers extends User {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }
    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody org.apache.catalina.User user) {
       userRepo.save(user);
       return "Saved...";
    }

    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody org.apache.catalina.User user){
        org.apache.catalina.User updatedUser = (org.apache.catalina.User) userRepo.findById(id).get();
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setPhoneNumber(user.getPhoneNumber());
        updatedUser.setUsername(user.getUsername());
        updatedUser.setAge(user.getAge());
        userRepo.save(updatedUser);
        return "Updated...";


    }
}
