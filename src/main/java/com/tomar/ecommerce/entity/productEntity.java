package com.tomar.ecommerce.entity;
import jakarta.persistence.*;
import java.util.List;
import java.time.LocalDateTime;

@Entity
public class productEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String productName;
private String productDescriptions;
private String sku;

private double finalPrice;
private double discountPrice;

private String category;
private String subCategory;

private boolean isActive;

private double rating;
private int reviewCount;

private int stock;
private String brand;

private LocalDateTime createdAt;
private LocalDateTime updatedAt;

@ElementCollection
private List<String> productImage;
}