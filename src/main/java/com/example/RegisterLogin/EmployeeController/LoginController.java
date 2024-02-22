package com.example.RegisterLogin.EmployeeController;

import com.example.RegisterLogin.Dto.*;
import com.example.RegisterLogin.Entity.*;
import com.example.RegisterLogin.Repo.*;
import com.example.RegisterLogin.Service.impl.*;
import com.example.RegisterLogin.response.LoginResponse;
import com.example.RegisterLogin.util.*;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.*;
import java.util.stream.*;

@RestController
public class LoginController
{

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserDetailsServiceImpl userDetailsService;

	@PostMapping("/login")
	public LoginResponse createAuthenticationToken(@RequestBody
			LoginDTO loginDTO, HttpServletResponse response) throws BadCredentialsException, DisabledException, UsernameNotFoundException, IOException {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDTO.getEmail(), loginDTO.getPassword()));
		} catch (BadCredentialsException e) {
			throw new BadCredentialsException("Incorrect username or password!");
		} catch (DisabledException disabledException) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND, "User is not activated");
			return null;
		}

		final UserDetails userDetails = userDetailsService.loadUserByUsername(loginDTO.getEmail());

		final String jwt = jwtUtil.generateToken(userDetails.getUsername());

		return new LoginResponse(jwt);

	}
	private EmployeeRepo employeerepo;

	@GetMapping("/employees")
	public ResponseEntity<Object> displayEmployees(@RequestHeader("jwttoken") String jwtToken){
//		try
//		{
			if (jwtToken == null)
			{
				return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
			}
			else
			{
				return new ResponseEntity<Object>(jwtToken, HttpStatus.OK);

//				List<Employee> employeeList = new ArrayList<>();
//				employeerepo.findAll().forEach(employeeList::add);
//				return new ResponseEntity<Object>(employeeList, HttpStatus.OK);
			}
//		}
//		catch (Exception exp){
//			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
//		}
	}

}