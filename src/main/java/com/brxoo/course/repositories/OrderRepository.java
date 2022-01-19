package com.brxoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brxoo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
