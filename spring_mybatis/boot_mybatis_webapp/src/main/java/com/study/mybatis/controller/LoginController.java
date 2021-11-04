package com.study.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.mybatis.common.Constants;
import com.study.mybatis.form.LoginForm;
import com.study.mybatis.form.CreateUserForm;
import com.study.mybatis.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	// 初期表示
	@RequestMapping("")
	public ModelAndView inint() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("form", new LoginForm());
		mav.setViewName(Constants.VIEW_NAME_LOGIN);
		return mav;
	}
	
	// ログインボタン押下時
	@RequestMapping(value = "login", params = "login")
	public ModelAndView login(@ModelAttribute("form") LoginForm form, BindingResult result) {
		ModelAndView mav = new ModelAndView();

		// エラー発生時
		if (result.hasErrors()) {
			mav.setViewName(Constants.VIEW_NAME_LOGIN);
			mav.addObject("form", form);
		}
		
		// select処理
		boolean res = loginService.getSelectMember(form);
		if (res == false) {
			// エラー時の処理
			mav.setViewName(Constants.VIEW_NAME_LOGIN);
			mav.addObject("form", form);
		}

		CreateUserForm create_form = new CreateUserForm(); 
		mav.setViewName(Constants.VIEW_NAME_HOME);
		mav.addObject("form", create_form);
		return mav;
	}
	
	// ユーザー作成
	@RequestMapping(value = "login", params = "new")
	public ModelAndView new_user(@ModelAttribute("form") LoginForm form, BindingResult result) {
		ModelAndView mav = new ModelAndView();

		CreateUserForm new_form = new CreateUserForm(); 
		mav.setViewName(Constants.VIEW_NAME_REGISTRATION);
		mav.addObject("form", new_form);
		return mav;
	}

}