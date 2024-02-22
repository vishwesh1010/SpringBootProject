package com.example.RegisterLogin.Service.impl;

import com.example.RegisterLogin.Dto.*;
import com.example.RegisterLogin.Entity.*;
import com.example.RegisterLogin.Repo.*;
import com.example.RegisterLogin.Service.*;
import com.example.RegisterLogin.response.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import javax.annotation.Resource;
import java.util.*;

@Service
public class EmployeeIMPL implements EmployeeService
{
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public EmployeeDTO addEmployee(SignupDTO signupDTO) {
		Employee employee = new Employee();
		employee.setEmployeename(signupDTO.getEmployeename());
		employee.setEmail(signupDTO.getEmail());
		employee.setPassword(new BCryptPasswordEncoder().encode(signupDTO.getPassword()));
		Employee createdEmployee = employeeRepo.save(employee);
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmployeeid(createdEmployee.getEmployeeid());
		employeeDTO.setEmail(createdEmployee.getEmail());
		employeeDTO.setEmployeename(createdEmployee.getEmployeename());
		return employeeDTO;
	}

}