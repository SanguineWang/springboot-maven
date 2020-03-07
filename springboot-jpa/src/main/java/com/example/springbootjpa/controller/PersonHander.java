package com.example.springbootjpa.controller;

import com.example.springbootjpa.entity.repository.Person;
import com.example.springbootjpa.repository.PersonReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/pepole")
public class PersonHander {
    @Autowired
    private PersonReporsitory personReporsitory;
    @GetMapping("/findall")
    public List<Person> findall() {
        return personReporsitory.findAll();
    }
}

