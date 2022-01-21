package com.brxoo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brxoo.course.entities.User;
import com.brxoo.course.repositories.UserRepository;
import com.brxoo.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User userEntity = repository.getOne(id);
		updateData(userEntity, obj);
		return repository.save(userEntity);
	}

	private void updateData(User userEntity, User obj) {
		userEntity.setName(obj.getName());
		userEntity.setEmail(obj.getEmail());
		userEntity.setPhone(obj.getPhone());
	}
}
