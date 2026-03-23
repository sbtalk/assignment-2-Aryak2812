package com.demo.spring.controllers;

import com.demo.spring.Entity.Product;
import com.demo.spring.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();

    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping(path="/",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
    @GetMapping("/category/{category}")
    public List<Product> getByCategory(@PathVariable String category) {
        return productService.getProductsByCategory(category);
    }

    @GetMapping("/price/{price}")
    public List<Product> getByPrice(@PathVariable Double price) {
        return productService.getProductsByPriceLessThan(price);
    }

}