package com.example.springboot.product.controller;

import com.example.springboot.product.model.ProductDto;
import com.example.springboot.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody ProductDto.Save dto) {
        productService.save(dto);
        return ResponseEntity.status(200).body("완료");
    }

   @GetMapping("/read")
    public ResponseEntity read(Integer idx) {
        ProductDto.Product result = productService.read(idx);
       return ResponseEntity.status(200).body(result);
    }

    @GetMapping("/list")
    public ResponseEntity list() {
        List<ProductDto.Product> result = productService.list();
        return  ResponseEntity.status(200).body(result);
    }

    @GetMapping("/productname")
    public ResponseEntity productname(String productname) {
        List<ProductDto.Product> result = productService.search(productname);

        return  ResponseEntity.status(200).body(result);
    }
}
