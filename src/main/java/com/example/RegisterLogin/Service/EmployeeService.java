package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Dto.*;
import com.example.RegisterLogin.response.*;

import org.springframework.stereotype.*;

@Service
public interface EmployeeService
{

	EmployeeDTO addEmployee(SignupDTO signupDTO);
}
