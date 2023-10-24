package com.Vaccination.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping("/index")
    public String indexPage()
    {
        return "index";
    }
    
    @GetMapping("/index1")
    public String showIndex() {
        return "index";
    }
     @PostMapping("/index1")
    public String indexPage1()
    {
        return "index";
    }

     @GetMapping("/adduser")
    public String AddUser2()
    {
        return "addUser";
    }
    
    @PostMapping("/adduser")
    public String AddUser()
    {
        return "addUser";
    }

    @PostMapping("/showUser")
    public String showUser()
    {
        return "showUser";
    }

    


    
}
