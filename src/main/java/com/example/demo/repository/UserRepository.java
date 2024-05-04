package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Users;
import java.util.List;


public interface UserRepository extends JpaRepository<Users, Integer>{
	
	public Users  findByUserName(String userName);

}
