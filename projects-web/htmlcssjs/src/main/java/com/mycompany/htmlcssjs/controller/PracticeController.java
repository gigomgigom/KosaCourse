package com.mycompany.htmlcssjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/practice")
public class PracticeController {
	
	@RequestMapping("")
	public String index() {
		log.info("index()실행");
		return "practice/index";
	}
	
	@RequestMapping("/practice_naver_login") //어떤 메소드를 호출할 것이냐?
	public String naverLogin() {
		log.info("naverLogin() 실행");
		return "practice/practice_naver_login";
	}
}