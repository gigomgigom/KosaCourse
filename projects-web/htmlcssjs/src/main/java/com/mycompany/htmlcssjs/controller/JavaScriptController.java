package com.mycompany.htmlcssjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/javascript")
public class JavaScriptController {
	
	@RequestMapping("")
	public String index() {
		log.info("index()실행");
		return "javascript/index";
	}
	
	@RequestMapping("/exam01_whereto")
	public String exam01Whereto() {
		log.info("exam01Whereto()실행");
		return "javascript/exam01_whereto";
	}
	
	@RequestMapping("/exam02_variables")
	public String exam02Variables() {
		log.info("exam02Variables()실행");
		return "javascript/exam02_variables";
	}
	
	@RequestMapping("/exam03_operations")
	public String exam03Operations() {
		log.info("exam03Operations()실행");
		return "javascript/exam03_operations";
	}
	
	@RequestMapping("/exam04_function")
	public String exam04Function() {
		log.info("exam04Operations()실행");
		return "javascript/exam04_function";
	}
	
	@RequestMapping("/exam05_object")
	public String exam05Object() {
		log.info("exam05Object()실행");
		return "javascript/exam05_object";
	}
}
