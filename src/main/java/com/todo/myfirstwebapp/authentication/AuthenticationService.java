package com.todo.myfirstwebapp.authentication;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String name, String password) {
		return name.equalsIgnoreCase("vishwas") && password.equals("12345");
	}
	
}
