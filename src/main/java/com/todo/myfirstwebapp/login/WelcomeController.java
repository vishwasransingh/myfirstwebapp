package com.todo.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	// @RequestMapping(value = "login", method = RequestMethod.GET)
	@RequestMapping("/")
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", "Vishwas");
		return "welcome";
	}

} 
