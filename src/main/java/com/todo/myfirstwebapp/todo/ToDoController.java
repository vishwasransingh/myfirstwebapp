package com.todo.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class ToDoController {
	
	private ToDoService toDoService;
	
	ToDoController(ToDoService toDoService) {
		this.toDoService = toDoService;
	}
	
	@RequestMapping("list-todo")
	public String listAllToDos(Model model) {
		model.addAttribute("todos", toDoService.findByUserName("Vishwas"));
		model.addAttribute("username", "Vishwas");
		return "list-todo";
	}
	
	@GetMapping("add-todo")
	public String showNewToDoPage() {
		return "add-todo";
	}
	
	@PostMapping("add-todo")
	public String addNewToDo() {
		return "redirect:list-todo";
	}
	
}
