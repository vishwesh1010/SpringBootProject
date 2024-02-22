package com.example.RegisterLogin.Dto;

public class SignupDTO
{
	private String employeename;
	private String email;
	private String password;

	public SignupDTO()
	{
	}


	public String getEmployeename()
	{
		return employeename;
	}

	public void setEmployeename(final String employeename)
	{
		this.employeename = employeename;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(final String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(final String password)
	{
		this.password = password;
	}

	public SignupDTO( final String employeename, final String email, final String password)
	{
		this.employeename = employeename;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString()
	{
		return "SignupDTO{" + "employeename='" + employeename + '\'' + ", email='" + email + '\'' + ", password='"
				+ password + '\'' + '}';
	}
}
