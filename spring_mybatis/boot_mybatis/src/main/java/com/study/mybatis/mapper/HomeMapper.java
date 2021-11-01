package com.study.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.study.mybatis.form.HomeForm;


@Mapper
public interface HomeMapper {
	
	// 登録ボタン押下時
	boolean insertClient(HomeForm form);

}
