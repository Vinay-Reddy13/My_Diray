package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.DiaryEntries;

public interface EntriesService {
	
	public DiaryEntries save(DiaryEntries diaryEntries);
	public void delete(DiaryEntries diaryEntries);
	public DiaryEntries update(DiaryEntries diaryEntries);
	public DiaryEntries getById(int id);
	public List<DiaryEntries> findAll();
	public List<DiaryEntries> findByUserId(int id);

}
