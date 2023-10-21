package com.todo.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	
	private static List<ToDo> todos = new ArrayList<>();
	
	static {
		todos.add(new ToDo(1, "Vishwas", "Core Java and Advanced Java", LocalDate.now().plusMonths(1), false));
		todos.add(new ToDo(2, "Satu", "SQL, MongoDB", LocalDate.now().plusMonths(2), false));
		todos.add(new ToDo(3, "XYZ", "Core Java and Advanced Java", LocalDate.now().plusMonths(3), false));
	}
	
	public List<ToDo> findByUserName(String username) {
		return todos;
	}
}
