package com.example.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void register(ProductDto.Register dto) {
        productRepository.save(dto.toEntity());
    }

    public List<ProductDto.Student> list() {
        List<ProductEntity> result = productRepository.findAll();

        return result.stream().map(ProductDto.Student::from).toList();
    }

    public ProductDto.Student read(Integer idx) {
        Optional<ProductEntity> result = productRepository.findById(idx);

        if (result.isPresent()) {
            ProductEntity entity = result.get();

            return ProductDto.Student.from(entity);
        }

        return null;
    }

    public List<ProductDto.Student> search(String name) {
        List<ProductEntity> result = productRepository.findByName(name);

        return result.stream().map(ProductDto.Student::from).toList();
    }

}
