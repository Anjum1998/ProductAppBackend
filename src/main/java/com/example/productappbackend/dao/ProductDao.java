package com.example.productappbackend.dao;

import com.example.productappbackend.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
