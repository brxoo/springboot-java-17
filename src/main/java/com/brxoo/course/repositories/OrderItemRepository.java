package com.brxoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brxoo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
