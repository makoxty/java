package com.study.mybatis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "Login")
@Entity
public class Login {
	
	@Id
	private int id;
	
	private int client_id;
	
	private String password;
	
	private String name;
	
	private int tell_number;
	
	private String sex;
	
	private int age;

}
