package com.example.RegisterLogin.Dto;

public class EmployeeDTO
{
	private int employeeid;
	private String employeename;
	private String email;
	private String password;
	public EmployeeDTO() {
	}
	public EmployeeDTO(int employeeid, String employeename, String email, String password) {
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.email = email;
		this.password = password;
	}

	public int getEmployeeid()
	{
		return employeeid;
	}

	public void setEmployeeid(final int employeeid)
	{
		this.employeeid = employeeid;
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

	@Override
	public String toString()
	{
		return "EmployeeDTO{" + "employeeid=" + employeeid + ", employeename='" + employeename + '\'' + ", email='"
				+ email + '\'' + ", password='" + password + '\'' + '}';
	}
}
