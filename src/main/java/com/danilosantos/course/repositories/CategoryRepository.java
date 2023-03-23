package com.danilosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilosantos.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
