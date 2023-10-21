package com.todo.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToDoController {
	
	private ToDoService toDoService;
	
	ToDoController(ToDoService toDoService) {
		this.toDoService = toDoService;
	}
	
	@RequestMapping("todolist")
	public String listAllToDos(Model model) {
		model.addAttribute("todos", toDoService.findByUserName("Vishwas"));
		model.addAttribute("username", "Vishwas");
		return "todolist";
	}
	
}
