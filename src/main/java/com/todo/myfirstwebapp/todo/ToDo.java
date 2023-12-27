package com.todo.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ToDo {

	@Id
	@GeneratedValue
	private int id;

	private String username;

	@Column(name = "description")
	@Size(min = 5, message = "Description should be at least 5 characters long.")
	private String desc;

	private LocalDate targetDate;

	private Boolean done;

}
