package com.brxoo.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brxoo.course.entities.OrderItem;
import com.brxoo.course.services.OrderItemService;

@RestController
@RequestMapping(value = "/items")
public class OrderItemResource {

	@Autowired
	private OrderItemService service;
	
	@GetMapping
	public ResponseEntity<List<OrderItem>> findAll() {
		List<OrderItem> orderItemList = service.findAll();
		return ResponseEntity.ok().body(orderItemList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<OrderItem> findById(@PathVariable Long id) {
		OrderItem obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
