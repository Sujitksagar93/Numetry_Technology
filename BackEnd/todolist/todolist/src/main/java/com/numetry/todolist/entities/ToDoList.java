package com.numetry.todolist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todolist")
public class ToDoList {

	@Id
	@GeneratedValue
	private long id;
	private String title;
	
	
	public ToDoList(long id, String title) {
		super();
		this.id = id;
		this.title = title;
	
	}


	public ToDoList() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "ToDoList [id=" + id + ", title=" + title + "]";
	}
	
	
	

}
