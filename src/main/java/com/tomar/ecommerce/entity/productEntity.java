package com.tomar.ecommerce.entity;
import jakarta.persistence.*;
import java.util.List;


@Entity
public class productEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String productName;
private String productDescriptions;
private double finalPrice;
private double discountPrice;
private int stock;

@ElementCollection
private List<String> productImage;

// Getters & Setters
}