package com.akshay.demo.DTO;

import lombok.Data;

@Data
public class LoginDTO 
{
	private String userid;
	private String password;
	
	public String toString()
	{
		return "Username: "+userid+" Password: "+password;
	}

	public String getUserid() {
		return userid;
	}

	public String getPassword() {
		return password;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
