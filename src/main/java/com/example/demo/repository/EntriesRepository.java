package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.DiaryEntries;

public interface EntriesRepository extends JpaRepository<DiaryEntries, Integer> {
	
	public List<DiaryEntries> findByUserId(int id);

	

	
	
	
}
