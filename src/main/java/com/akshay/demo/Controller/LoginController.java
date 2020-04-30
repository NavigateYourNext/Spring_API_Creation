package com.akshay.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.demo.DTO.LoginDTO;
import com.akshay.demo.Services.LoginServices;

@RestController
public class LoginController 
{
	@Autowired
	LoginServices loginservices;
	
	@PostMapping(path="/api/postData", consumes="application/json" )
	public void getDetails(@RequestBody LoginDTO logindto)
	{
		System.out.println(logindto.toString());
		loginservices.postEntity(logindto);
	}
}
