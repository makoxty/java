package com.study.mybatis.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.mybatis.entity.Login;
import com.study.mybatis.form.CreateUserForm;
import com.study.mybatis.mapper.CreateUserMapper;

@Service
public class CreateUserService {
	
	@Autowired
	CreateUserMapper createUserMapper;

	public boolean insertUser(CreateUserForm form) {
		Login entity =  new Login();
		BeanUtils.copyProperties(entity, form);
		boolean res = createUserMapper.insertUser(entity);
		return res;
	}

}
