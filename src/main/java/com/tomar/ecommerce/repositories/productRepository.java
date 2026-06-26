package com.tomar.ecommerce.repositories;




import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Product, Long> {
}