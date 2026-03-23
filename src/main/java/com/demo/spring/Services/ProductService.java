package com.demo.spring.Services;

import com.demo.spring.Entity.Product;
import java.util.List;

import com.demo.spring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }
    public List<Product> getProductsByPriceLessThan(Double price) {
        return productRepository.findByPriceLessThan(price);
    }
}