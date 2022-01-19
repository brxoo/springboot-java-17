package com.brxoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brxoo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
