package com.todo.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SayHelloController {
	
	//@ResponseBody
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello! How are you?";
	}
	
	@RequestMapping("/person")
	public Person jsonPerson() {
		return new Person("Vishwas", (short) 25, "Ahmednagar", "7743898263");
	}
	
}
