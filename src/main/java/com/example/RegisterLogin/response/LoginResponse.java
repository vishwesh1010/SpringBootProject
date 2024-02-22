package com.example.RegisterLogin.response;

public class LoginResponse
{
	private String jwtToken;


	public LoginResponse()
	{
	}

	public LoginResponse(final String jwtToken)
	{
		this.jwtToken = jwtToken;
	}

	public String getJwtToken()
	{
		return jwtToken;
	}

	public void setJwtToken(final String jwtToken)
	{
		this.jwtToken = jwtToken;
	}

	@Override
	public String toString()
	{
		return "LoginResponse{" + "jwtToken='" + jwtToken + '\'' + '}';
	}
}
