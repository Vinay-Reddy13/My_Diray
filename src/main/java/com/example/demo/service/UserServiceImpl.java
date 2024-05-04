package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;
import com.example.demo.entity.Users;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	
	public Users save(Users users) {
		return userRepo.save(users);
	
	}

	
	public void delete(Users users) {
		userRepo.delete(users);

	}

	public Users update(Users user) {
		return userRepo.save(user);
		

	}

	
	public Users getById(int id) {
      return userRepo.findById(id).get();
		
	}

	
	public List<Users> findAll() {
		
		return userRepo.findAll();
	}


	
	public Users findByuserName(String userName) {
		
		return userRepo.findByUserName(userName);
	}


}
