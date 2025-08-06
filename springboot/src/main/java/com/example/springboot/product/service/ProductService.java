package com.example.springboot.product.service;

import com.example.springboot.product.model.ProductDto;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final com.example.springboot.product.repository.ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void save(ProductDto.Save dto) {
        productRepository.save(dto.toEntity());
    }

    public List<ProductDto.Product> list() {
        List<ProductEntity> result = productRepository.findAll();

        return result.stream().map(ProductDto.Student::from).toList();
    }

    public ProductDto.Product read(Integer idx) {
        Optional<ProductEntity> result = productRepository.findById(idx);

        if (result.isPresent()) {
            ProductEntity entity = result.get();

            return ProductDto.Product.from(entity);
        }

        return null;
    }

    public List<ProductDto.Product> search(String name) {
        List<ProductEntity> result = productRepository.findByName(name);

        return result.stream().map(ProductDto.Product::from).toList();
    }

}
