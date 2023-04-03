package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DailyEntry;

public interface DailyEntryRepository extends JpaRepository<DailyEntry, String> {

}
