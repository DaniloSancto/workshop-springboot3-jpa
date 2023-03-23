package com.danilosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilosantos.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
