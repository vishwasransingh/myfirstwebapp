package com.todo.myfirstwebapp.shutdown;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShutDownController {
	@Autowired
	private ConfigurableApplicationContext context;
	
	@PostMapping("/shutdown")
	public void shutDown() {
		SpringApplication.exit(context, () -> 0);
	}
	
}
