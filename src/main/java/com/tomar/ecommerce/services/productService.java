package com.tomar.ecommerce.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {

@Autowired
private productService productRepository;

//public productService createProduct(Product product) {
//	return productRepository.save(product);
//}
}