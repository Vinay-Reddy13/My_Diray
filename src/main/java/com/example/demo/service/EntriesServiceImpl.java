package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EntriesRepository;
import com.example.demo.entity.DiaryEntries;
import com.example.demo.entity.Users;

@Service
public class EntriesServiceImpl implements EntriesService{
	
	@Autowired
	private EntriesRepository Erepo;
	
	
	public DiaryEntries save(DiaryEntries diaryEntries) {
     return Erepo.save(diaryEntries);
		
	}

	
	public void delete(DiaryEntries diaryEntries) {
		Erepo.delete(diaryEntries);
		
	}

	
	public DiaryEntries update(DiaryEntries diaryEntries) {
		return Erepo.save(diaryEntries);
		
	}


	
	public List<DiaryEntries> findAll() {
		
		return Erepo.findAll();
	}


	
	public List<DiaryEntries> findByUserId(int id) {
		List<DiaryEntries> findbyuserid=Erepo.findByUserId(id);
		
		return findbyuserid;
	}




	@Override
	public DiaryEntries getById(int id) {
		// TODO Auto-generated method stub
		return Erepo.findById(id).get();
	}


	

	

}
