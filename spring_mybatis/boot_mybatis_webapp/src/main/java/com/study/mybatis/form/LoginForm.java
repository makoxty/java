package com.study.mybatis.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class LoginForm implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private int login_id;
	
	private String password;

}
