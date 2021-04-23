package com.example.demo.Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Member{
	
	@Id
	private Long id;
	
	@Column(length=500, nullable = false)
	private String name;
	
	@Column(length=500, nullable = false)
	private String password;
	
	@Column(length=500, nullable=true)
	private String email;

}
