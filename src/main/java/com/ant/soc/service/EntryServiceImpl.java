package com.ant.soc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ant.soc.repository.EntryRepository;

@Service
public class EntryServiceImpl implements EntryService {
	@Autowired
	private EntryRepository entryRepository;
	public Integer createEntry(String text) {
		LocalDateTime now = LocalDateTime.now();
		
		String formattedDate = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		
		return 0; 
	}
}
