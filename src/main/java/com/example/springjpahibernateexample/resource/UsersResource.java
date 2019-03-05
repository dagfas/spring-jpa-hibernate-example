package com.example.springjpahibernateexample.resource;


import com.example.springjpahibernateexample.model.Users;
import com.example.springjpahibernateexample.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;


    //Next line returns all the data from the database
    //Users is a model we created
    @GetMapping("/all")
    public List<Users> getAll(){
        return usersRepository.findAll();
    }
}
