package com.todo.myfirstwebapp.todo;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

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
	public String showNewToDoPage(Model model) {
		String userName = (String)model.getAttribute("name");
		ToDo toDo = new ToDo(0, userName, "", LocalDate.now().plusYears(1), false);
		model.addAttribute("toDo", toDo);
		return "add-todo";
	}
	
	@PostMapping("add-todo")
	public String addNewToDo(Model model, @Valid ToDo toDo, BindingResult result) {
		if (result.hasErrors())
			return "add-todo";
		String userName = (String)model.getAttribute("name");
		toDoService.addToDo(userName, toDo.getDesc(), LocalDate.now().plusYears(1), false);
		return "redirect:list-todo";
	}
	
	@GetMapping("delete-todo")
	public String deleteToDo(@RequestParam int id) {
		toDoService.deleteToDo(id);
		return "redirect:list-todo";
	}
	
	@GetMapping("update-todo")
	public String showUpdateToDoPage(@RequestParam int id, Model model) {
		ToDo todo = toDoService.findById(id);
		model.addAttribute("toDo",todo);
		return "add-todo";
	}
	
}
