package com.ant.soc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Writer {
	@Id
	private Integer id;
	private String username;
	private String email;
	private String pass_hash;
}
