package com.study.mybatis.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class CreateUserForm implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private int client_id;
	
	private String password;
	
	private String name;
	
	private String tell_number;
	
	private String sex;
	
	private int age;

}
