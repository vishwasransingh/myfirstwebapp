package com.todo.myfirstwebapp;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstwebappApplication.class, args);
		openWebpage("http://localhost:8080/");
	} 
	
	public static void openWebpage(String url) {
        try {
            String command = "cmd /c start " + url;
            Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
