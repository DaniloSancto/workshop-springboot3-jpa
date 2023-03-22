package com.danilosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilosantos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}
