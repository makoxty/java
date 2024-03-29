package com.study.mybatis.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class HomeForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	
	private int clientId;
	
	private String name;
	
	private String tellNumber;
	
	private String sex;
	
	private int age;

}
