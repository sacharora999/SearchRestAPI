package com.example.demosearchapp.repo;

import com.example.demosearchapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {

    @Query("SELECT p from Product p where " +
            "p.name LIKE CONCAT('%', :query, '%')" +
            "OR p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts(String query);

}
