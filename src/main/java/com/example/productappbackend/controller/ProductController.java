package com.example.productappbackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/")
    public String HomePage()
    {
        return "Welcome to product home page";
    }
    @PostMapping("/productAdd")
    public String ProductAdd()
    {
        return "Welcome to product add page";
    }
    @PostMapping("/searchProduct")
    public String ProductSearch()
    {
        return "Welcome to product search page";
    }
}
