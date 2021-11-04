package com.study.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.mybatis.common.Constants;
import com.study.mybatis.form.CreateUserForm;
import com.study.mybatis.form.LoginForm;
import com.study.mybatis.service.CreateUserService;

@Controller
public class CreateUserController {
	
	@Autowired
	CreateUserService createService;
	
	// 登録ボタン
	@RequestMapping(value = "new", params = "regist")
	public ModelAndView login(@ModelAttribute("form") CreateUserForm form, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		// エラー発生時
		if (result.hasErrors()) {
			mav.setViewName(Constants.VIEW_NAME_REGISTRATION);
			mav.addObject("form", form);
		}
		
		// insert処理
		boolean res = createService.insertUser(form);
		if (res == false) {
			// エラー時の処理
			mav.setViewName(Constants.VIEW_NAME_REGISTRATION);
			mav.addObject("form", form);
		}
 
		// insertが成功したらログイン画面に戻す
		LoginForm loginForm = new LoginForm();
		mav.setViewName(Constants.VIEW_NAME_HOME);
		mav.addObject("form", loginForm);
		
		return mav;
	}

}
