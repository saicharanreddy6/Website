package com.example.aboutmewebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aboutmewebsite.repositories.*;
import com.example.aboutmewebsite.entity.*;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User getUserById(Long Id) {
		return userRepository.findById(Id).orElse(null);
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public void deleteUser(Long Id) {
		userRepository.deleteById(Id);
	}

}
