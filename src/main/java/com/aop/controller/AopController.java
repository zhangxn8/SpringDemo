package com.aop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class AopController {
   
	@RequestMapping(value="/test")
	public void test(){
		System.out.println("jsaldjsal");
	}
}
