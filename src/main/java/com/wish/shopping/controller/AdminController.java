package com.wish.shopping.controller;

import com.wish.shopping.utils.EmailLogging;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {


    @GetMapping("/admin")
    public String adminTest(){
        return "admin";
    }
}
