package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.User;
import com.example.project.repository.UserRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	public List<User> listAllUser(){
		return userRepository.findAll();
	}
	public void saveUser(User user) {
		userRepository.save(user);
	}
	public User getUser(Integer id) {
		return userRepository.findById(id).get();
	}
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

}
