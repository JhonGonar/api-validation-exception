package com.example.apivalidationexceptioon.service;

import com.example.apivalidationexceptioon.dto.UserRequest;
import com.example.apivalidationexceptioon.entity.User;
import com.example.apivalidationexceptioon.exception.UserNotFoundException;
import com.example.apivalidationexceptioon.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record UserService(UserRepo repository) {
    public User saveUser(UserRequest request){
        var user = new User(request.getName(), request.getEmail(), request.getMobile(), request.getGender(), request.getAge(), request.getNationality());
        return repository.save(user);
    }
    public List<User> getAllUsers(){
        return repository.findAll();
    }
    public User getUser(int id) throws UserNotFoundException {
        var user = repository.findByUserId(id);
        if (user != null)
            return user;
        else
            throw new UserNotFoundException("User not found with id:" + id);
    }

}
