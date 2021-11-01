package com.study.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.mybatis.form.HomeForm;
import com.study.mybatis.mapper.HomeMapper;

@Controller
public class HomeController {

	@Autowired
	HomeMapper homeMapper;
	
	private static String VIEW_NAME = "home";

	// 初期表示
	@RequestMapping("")
	public ModelAndView inint() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("form", new HomeForm());
		mav.setViewName(VIEW_NAME);
		return mav;
	}

	// 登録ボタン押下時
	@RequestMapping(value = "home/ja", params = "regist")
	public ModelAndView regist(@ModelAttribute("form") HomeForm form, BindingResult result) {
		ModelAndView mav = new ModelAndView();

		// エラー発生時
		if (result.hasErrors()) {
			mav.setViewName(VIEW_NAME);
			mav.addObject("form", form);
		}
		
		// Insert処理
		boolean res = homeMapper.insertClient(form);
		if (res == false) {
			// エラー時の処理
			mav.setViewName(VIEW_NAME);
			mav.addObject("form", form);
		}

		mav.setViewName(VIEW_NAME);
		mav.addObject("form", form);
		return mav;
	}
}
