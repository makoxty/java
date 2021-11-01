package com.study.mybatis.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "CLIENT")
@Entity
public class Home implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	private String name;
	
	// 電話番号
	private String tellNumber;
	
	// 性別
	private String sex;
	
	// 年齢
	private int age;

}
