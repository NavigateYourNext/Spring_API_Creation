package com.akshay.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.akshay.demo.DTO.LoginDTO;
import com.akshay.demo.Entity.LoginEntity;
import com.akshay.demo.Resouces.LoginRepo;

@Component
public class LoginServices
{
	@Autowired
	LoginRepo loginrepo;
	
	public void postEntity(LoginDTO logindto)
	{
		LoginEntity loginEntity = new LoginEntity();
		loginEntity.setUsername(logindto.getUserid());
		loginEntity.setPassword(logindto.getPassword());
		
		loginrepo.save(loginEntity);
	}
}
