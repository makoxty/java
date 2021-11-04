package com.study.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.study.mybatis.form.LoginForm;

@Mapper
public interface LoginMapper {
	
	// ログインボタン押下時
	boolean getSelectMember(LoginForm form);

}
