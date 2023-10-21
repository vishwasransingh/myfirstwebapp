package com.todo.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class ToDoService {
	
	private static List<ToDo> todos;
	
	static {
		todos.add(new ToDo(1, "Learn Java", "Core Java and Advanced Java", LocalDate.now().plusMonths(1), false));
		todos.add(new ToDo(1, "Learn DBMS", "SQL, MongoDB", LocalDate.now().plusMonths(2), false));
		todos.add(new ToDo(1, "Learn Java", "Core Java and Advanced Java", LocalDate.now().plusMonths(3), false));
	}
	
	public List<ToDo> findByUserName() {
		return todos;
	}
}
