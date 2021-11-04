package com.study.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.mybatis.form.LoginForm;
import com.study.mybatis.mapper.LoginMapper;

@Service
public class LoginService {
	
	@Autowired
	LoginMapper loginMapper;

	public boolean getSelectMember(LoginForm form) {
		boolean res = loginMapper.getSelectMember(form);
		return res;
	}

}
