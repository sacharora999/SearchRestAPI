package com.example.demosearchapp.service;

import com.example.demosearchapp.entity.Product;
import com.example.demosearchapp.repo.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{


    private ProductRepo productRepo;


    @Override
    public List<Product> searchProds(String query) {
        return productRepo.searchProducts(query);
    }

    @Override
    public Product createProd(Product product) {
        return productRepo.save(product);
    }
}
