package com.raj.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.springweb.model.Product;

public interface ProductJpaRepository extends JpaRepository<Product, Long> {

}
