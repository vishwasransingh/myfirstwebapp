package com.todo.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	
	/**
	 *@ResponseBody -> Redirects response as a String-message printed on a 
	 *dynamic webpage and not the user defined custom web-page.
	 */
	@ResponseBody
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello! How are you?";
	}
	
//	@RequestMapping("/person")
//	public Person jsonPerson() {
//		return new Person("Vishwas", (short) 25, "Ahmednagar", "7743898263");
//	}
	
	@RequestMapping("/hellojsp")
	public String sayHelloJsp() {
		return "hello";
	}
	
	//@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
}
