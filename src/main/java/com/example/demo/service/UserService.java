package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Users;

public interface UserService  {

	public Users save(Users users);
	public void delete(Users user);
	public Users update(Users user);
	public Users getById(int id);
	public List<Users> findAll();
	public Users findByuserName(String userName);
	
}