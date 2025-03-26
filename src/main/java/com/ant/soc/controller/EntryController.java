package com.ant.soc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="entry")
public class EntryController {
	@PostMapping
	public ResponseEntity<String> createEntry(String text) {
		
	}
}
