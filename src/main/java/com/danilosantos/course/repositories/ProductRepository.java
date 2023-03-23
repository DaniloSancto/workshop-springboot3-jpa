package com.danilosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilosantos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
