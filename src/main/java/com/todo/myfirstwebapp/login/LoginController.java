package com.todo.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
}
