package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.niit.model.Product;
import com.niit.services.ProductService;

@Controller

public class controller {
	public controller(){
		System.out.println("HomeController is instantiated");
		
	}
	@Autowired
	private ProductService productService;
	@RequestMapping(value="/home")
	public String homePage(HttpSession session){
			session.setAttribute("categories", productService.getAllCategories());
		return "home";//logical view name
	}
	@RequestMapping("/aboutus")
public String aboutUs(){
	return "aboutus";
}
	
	
}
