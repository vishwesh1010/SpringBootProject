package com.example.RegisterLogin.EmployeeController;


import com.example.RegisterLogin.Dto.*;
import com.example.RegisterLogin.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/sign-up")
	public ResponseEntity<?> signupUser(@RequestBody
			SignupDTO signupDTO) {
		EmployeeDTO createdEmployee = employeeService.addEmployee(signupDTO);
		if (createdEmployee == null){
			return new ResponseEntity<>("Employee not created, come again later!", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
	}

}
