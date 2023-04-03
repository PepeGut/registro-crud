package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DailyEntry;
import com.example.demo.repository.DailyEntryRepository;

@Service
public class DailyEntryService {
	
	@Autowired
	private DailyEntryRepository dailyEntryRepository;
	
	public DailyEntry create (DailyEntry dailyEntry) {
		return dailyEntryRepository.save(dailyEntry);
	}
	
	public List<DailyEntry> getAllDailyEntry (){
		return dailyEntryRepository.findAll();
	}
	
	public void delete (DailyEntry dailyEntry) {
		dailyEntryRepository.delete(dailyEntry);
	}
	
	public Optional<DailyEntry> findById (String userId){
		return dailyEntryRepository.findById(userId);
	}

}
