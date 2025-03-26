package com.ant.soc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ant.soc.service.EntryService;



@RestController
@RequestMapping(value="entry")
public class EntryController {
	@Autowired
	private EntryService entryService;
	@PostMapping
	public ResponseEntity<Integer> createEntry(String text) {

		Integer createdEntryId = entryService.createEntry(text);
		return new ResponseEntity<>(createdEntryId, HttpStatus.CREATED);
	}
}
