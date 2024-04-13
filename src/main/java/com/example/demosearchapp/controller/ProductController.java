package com.example.demosearchapp.controller;

import com.example.demosearchapp.entity.Product;
import com.example.demosearchapp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchMyProds(@RequestParam("query") String query){
        return new ResponseEntity<>(productService.searchProds(query), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.createProd(product), HttpStatus.CREATED);
    }
}
