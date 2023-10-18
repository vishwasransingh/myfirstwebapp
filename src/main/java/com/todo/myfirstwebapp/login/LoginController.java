package com.todo.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String login(@RequestParam("username") String name, Model model) {
		model.addAttribute("name", name);
		return "login";
	}
	
}
