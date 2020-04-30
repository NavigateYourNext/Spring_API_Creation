package com.akshay.demo.Resouces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.demo.Entity.LoginEntity;

public interface LoginRepo extends JpaRepository<LoginEntity, String> 
{

}
