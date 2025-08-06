package com.example.springboot.Product.repository;


import com.example.springboot.Product.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
    List<ProductEntity> findByName(String name);

}
