package com.brxoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brxoo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
