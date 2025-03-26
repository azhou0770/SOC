package com.ant.soc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Entry {
	@Id
	private Integer id;
	private Integer writerId; 
	private String text; 
	
}
