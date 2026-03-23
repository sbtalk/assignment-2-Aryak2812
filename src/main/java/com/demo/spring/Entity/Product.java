package com.demo.spring.Entity;
import jakarta.persistence.*;
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;
    private String name;
    private String category;


    public Product() {
    }
    public Product(Long id, Double price, String name, String category) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.category = category;
    }
    public Long getId() {
        return id;
    }
    public Double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}