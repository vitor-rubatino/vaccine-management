package com.rubatino.vacinas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubatino.vacinas.entities.User;
import com.rubatino.vacinas.repositories.UserRepository;
import com.rubatino.vacinas.services.exceptions.ResourceNotCreatedException;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User insert(User user) {
		try {
			return userRepository.save(user);
		} catch (RuntimeException e) {
			throw new ResourceNotCreatedException(user);
		}
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public User update(Long id, User user) {
		User entity = userRepository.getById(id);
		updateData(entity, user);
		return userRepository.save(entity);
	}

	private void updateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setCpf(user.getCpf());
		entity.setBirthDate(user.getBirthDate());
	}
}
