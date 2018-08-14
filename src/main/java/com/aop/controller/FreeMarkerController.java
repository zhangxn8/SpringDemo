package com.aop.controller;


import java.util.jar.Attributes.Name;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/admin/view")
public class FreeMarkerController {
    
	//页面
	private static String name = "/hello.html";
	
	@RequestMapping("/freemaker")
	public ModelAndView queryAndView(HttpServletRequest request, HttpServletResponse response){
		
		System.out.println("进入成功");
		request.setAttribute("name", "my best love fishi");
		return new ModelAndView(name); 
				
	}
}
