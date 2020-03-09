package com.example.springboothelloworld.controller;

import com.example.springboothelloworld.entity.Book;
import com.example.springboothelloworld.repository.BookReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/book")
public class BookHander {
    @Autowired
    private BookReporsitory bookReporsitory;
    @GetMapping("/findall")
    public List<Book> findall() {
        return bookReporsitory.findAll();
    }
}

