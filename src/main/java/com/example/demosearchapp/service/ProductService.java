package com.example.demosearchapp.service;

import com.example.demosearchapp.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProds(String query);
    Product createProd(Product product);
}
