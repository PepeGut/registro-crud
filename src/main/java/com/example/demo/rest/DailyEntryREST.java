package com.example.demo.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DailyEntry;
import com.example.demo.service.DailyEntryService;

@RestController
@RequestMapping ("/api/dailyEntry/")
public class DailyEntryREST {
	
	@Autowired
	private DailyEntryService dailyEntryService;
	
	@PostMapping
	private ResponseEntity<DailyEntry> save (@RequestBody DailyEntry dailyEntry){
		DailyEntry dailyEntryTemp = dailyEntryService.create(dailyEntry);
		
		try {
			return ResponseEntity.created(new URI("/api/dailyEntry/"+dailyEntryTemp.getUserId())).body(dailyEntryTemp);
			
		} catch (Exception e) {
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping
	private ResponseEntity<List<DailyEntry>> listingAll (){
		return ResponseEntity.ok(dailyEntryService.getAllDailyEntry());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> deleteDailyEntry (@RequestBody DailyEntry dailyEntry){
		dailyEntryService.delete(dailyEntry);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping (value ="{userId}")
	private ResponseEntity<Optional<DailyEntry>> getById (@PathVariable ("userId") String userId){
		return ResponseEntity.ok(dailyEntryService.findById(userId));
	}
	
	

}
