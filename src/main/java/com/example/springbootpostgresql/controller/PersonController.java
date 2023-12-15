package com.example.springbootpostgresql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springbootpostgresql.model.Person;

@Controller
public class PersonController {
    @Autowired
    PersonService service;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("person", new Person());
        return "index";
    }

    @PostMapping("/insertPerson")
    public String insertPerson(@ModelAttribute Person person, Model model){
        service.insert(person);
        return "result";
    }
}
