package com.todo.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class ToDoService {

	private static int todosCount = 0;
	private static List<ToDo> todos = new ArrayList<>();

	static {
		todos.add(
				new ToDo(++todosCount, "Vishwas", "Core Java and Advanced Java", LocalDate.now().plusMonths(1), false));
		todos.add(new ToDo(++todosCount, "Satu", "SQL, MongoDB", LocalDate.now().plusMonths(2), false));
		todos.add(new ToDo(++todosCount, "XYZ", "Advanced Java", LocalDate.now().plusMonths(3), false));
	}

	public List<ToDo> findByUserName(String username) {
		Predicate<? super ToDo> predicate = toDo -> toDo.getUsername().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	}

	public void addToDo(String userName, String desc, LocalDate targetDate, boolean isDone) {
		ToDo toDo = new ToDo(++todosCount, userName, desc, targetDate, isDone);
		todos.add(toDo);
	}

	public void deleteToDo(int id) {
		/*
		 * Predicate<? super ToDo> predicate = toDo -> toDo.getId() == id;
		 * todos.removeIf(predicate);
		 */

		Iterator<ToDo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			ToDo toDo = iterator.next();
			if (toDo.getId() == id) {
				iterator.remove();
			}
		}
	}

	public ToDo findById(int id) {
		Predicate<? super ToDo> predicate = toDo -> toDo.getId() == id;
		ToDo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateToDo(@Valid ToDo toDo) {
		deleteToDo(toDo.getId());
		todos.add(toDo);
	}
}
