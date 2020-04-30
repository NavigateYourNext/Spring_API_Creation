package com.akshay.demo.Entity;


import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;

@Data
@Entity
@Table(name="LoginTable")
public class LoginEntity
{

	@Id
	private String userid;

	private String username;
	private String password;

	public LoginEntity()
	{
		this.userid = UUID.randomUUID().toString();
	}

	public String getUserid() {
		return userid;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
