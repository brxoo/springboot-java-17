package com.brxoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brxoo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
