package com.example.productappbackend.controller;

import com.example.productappbackend.dao.ProductDao;
import com.example.productappbackend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductDao dao;

    @PostMapping("/")
    public String HomePage()
    {
        return "Welcome to product home page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/productAdd",consumes = "application/json",produces = "application/json")
    public String ProductAdd(@RequestBody Product p)
    {
        System.out.println(p.getProductCode());
        System.out.println(p.getProductName().toString());
        System.out.println(p.getManufacturingDate().toString());
        System.out.println(p.getExpiryDate().toString());
        System.out.println(p.getBrand().toString());
        System.out.println(p.getDistributorName().toString());
        System.out.println(p.getPrice());
        System.out.println(p.getSellerName().toString());
        dao.save(p);
        return "Welcome to product add page";
    }
    @PostMapping("/searchProduct")
    public String ProductSearch()
    {
        return "Welcome to product search page";
    }
    @PostMapping("/editProduct")
    public String ProductEdit()
    {
        return "Welcome to product edit page";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewProduct")
    public List<Product> ProductView()
    {
        return (List<Product>) dao.findAll();
    }
    @PostMapping("/deleteProduct")
    public String ProductDelete()
    {
        return "Welcome to product delete page";
    }
}
