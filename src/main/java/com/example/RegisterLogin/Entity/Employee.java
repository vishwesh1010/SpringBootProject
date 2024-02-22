package com.example.RegisterLogin.Entity;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee
{

	@Id
	@Column(name = "employee_id",
			length = 45)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeid;

	@Column(name = "employee_name",
			length = 255)
	private String employeename;

	@Column(name = "email",
			length = 255)
	private String email;

	@Column(name = "password",
			length = 255)
	private String password;

	public Employee()
	{
	}

	public Employee(int employeeid, String employeename, String email, String password)
	{
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
		return "Employee{" + "employeeid=" + employeeid + ", employeename='" + employeename + '\'' + ", email='" + email
				+ '\'' + ", password='" + password + '\'' + '}';
	}
}
