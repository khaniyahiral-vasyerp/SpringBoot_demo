package com.example.bootJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.bootJPA.model.UserDetails;
import com.example.bootJPA.service.Userservice;

@RestController

public class Mycontroller {
	@Autowired
	Userservice us;

	@GetMapping("/get/{id}")
	public UserDetails viewHomepage(@PathVariable Integer id)
	{
		return us.getUserDetailsById(id);
	}
	
	@PostMapping("/add")
	public void adduser(@RequestBody UserDetails userDetails)
	{
	 us.saveUserDetais(userDetails);
	}
	
	/*
	 * public String viewUserDetailsList(Model model) {
	 * model..model.("useDetaislList",us.getalluserdetails());
	 * //us.getalluserdetails(); return "viewUserDEtailsList";
	 * 
	 * }
	 */
	@PostMapping("/update")
	public void deleteuser(Integer id)
	{
		us.deleteUserDetailsById(id);
	}
}
