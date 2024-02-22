package com.example.RegisterLogin.Service.impl;

import com.example.RegisterLogin.Entity.*;
import com.example.RegisterLogin.Repo.*;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.*;

@Service
public class UserDetailsServiceImpl implements UserDetailsService
{

	@Autowired
	private EmployeeRepo employeeRepo;


	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		//Write Logic to get the user from the DB
		Employee employee = employeeRepo.findByEmail(email);
		if(employee == null){
			throw new UsernameNotFoundException("User not found",null);
		}
		return new org.springframework.security.core.userdetails.User(employee.getEmail(), employee.getPassword(), new ArrayList<>());
	}
}

