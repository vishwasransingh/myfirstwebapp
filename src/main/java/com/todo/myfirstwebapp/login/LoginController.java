package com.todo.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.todo.myfirstwebapp.authentication.AuthenticationService;

@Controller
public class LoginController {
	@Autowired
	private AuthenticationService authServ;
	private Logger log = LoggerFactory.getLogger(getClass());

	// @RequestMapping(value = "login", method = RequestMethod.GET)
	@GetMapping("login")
	public String login() {
		return "login";
	}

	// @RequestMapping(value = "login", method = RequestMethod.POST)
	@PostMapping("login")
	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, Model model) {

		if (authServ.authenticate(name, password)) {
			model.addAttribute("name", name);
			model.addAttribute("password", password);
			return "welcome";
		} else {
			model.addAttribute("error", "Wrong user-name or password.");
			return "login";
		}

	}

}
