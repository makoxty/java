package com.study.mybatis.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class HomeForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	
	// 名前
	private String name;
	
	// 電話番号
	private String tellNumber;
	
	// 性別
	private String sex;
	
	// 年齢
	private int age;

}
