package com.todo.myfirstwebapp.todo;

import java.time.LocalDate;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

//@Controller      {Backup controller, Jpa controller is now the main controller.}
@SessionAttributes("username")
public class ToDoController {
	
	private ToDoService toDoService;
	
	ToDoController(ToDoService toDoService) {
		this.toDoService = toDoService;
	}
	
	@RequestMapping("list-todo")
	public String listAllToDos(Model model) {
		String userName = getLoggedInUsername(model);
		model.addAttribute("todos", toDoService.findByUserName(userName));
		model.addAttribute("username", userName);
		return "listtodo";
	}

	private String getLoggedInUsername(Model model) {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
	@GetMapping("add-todo")
	public String showNewToDoPage(Model model) {
		String userName = getLoggedInUsername(model);
		ToDo toDo = new ToDo(0, userName, "", LocalDate.now().plusYears(1), false);
		model.addAttribute("toDo", toDo);
		model.addAttribute("pageName","Add Task");
		return "addtodo";
	}
	
	@PostMapping("add-todo")
	public String addNewToDo(Model model, @Valid ToDo toDo, BindingResult result) {
		if (result.hasErrors())
			return "addtodo";
		String userName = getLoggedInUsername(model);
		toDoService.addToDo(userName, toDo.getDesc(), toDo.getTargetDate(), false);
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
		model.addAttribute("pageName","Update Task");
		return "addtodo";
	}
	
	@PostMapping("update-todo")
	public String updateToDo(Model model, @Valid ToDo toDo, BindingResult result) {
		if (result.hasErrors())
			return "addtodo";
		String userName = getLoggedInUsername(model);
		toDo.setUsername(userName);
		toDoService.updateToDo(toDo);
		return "redirect:list-todo";
	}
	
}
