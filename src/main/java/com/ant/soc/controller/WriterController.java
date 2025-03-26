package com.ant.soc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ant.soc.service.WriterService;

@RestController
@RequestMapping(value = "writer")
public class WriterController {
	@Autowired
	private WriterService writerService;
	
	@PostMapping
	public ResponseEntity<Integer> createWriter(String email, String username, String password){
		Integer id = writerService.createWriter(email, username, password);
		return new ResponseEntity<>(id, HttpStatus.CREATED);
	}
}
