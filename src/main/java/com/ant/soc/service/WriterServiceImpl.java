package com.ant.soc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ant.soc.repository.WriterRepository;

@Service
public class WriterServiceImpl implements WriterService {
	@Autowired
	private WriterRepository writerRepository;
	public Integer createWriter(String email, String username, String password) {
		if (writerRepository.findByEmail(email) != null) {
//			return some exception
		}
		if (writerRepository.findByUsername(username) != null) {
//			return some exception 
		}
		
		
		return 0;
	}
}
