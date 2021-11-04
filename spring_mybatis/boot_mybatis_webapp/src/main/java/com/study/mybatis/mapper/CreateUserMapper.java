package com.study.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.study.mybatis.entity.Login;

@Mapper
public interface CreateUserMapper {
	
	// 登録ボタン押下
	boolean insertUser(Login form);

}
