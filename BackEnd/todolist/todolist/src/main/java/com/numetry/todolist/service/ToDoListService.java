package com.numetry.todolist.service;


import java.util.List;
import com.numetry.todolist.entities.ToDoList;

public interface ToDoListService {
	
	
	public List<ToDoList> getList();
	
	public ToDoList saveList(ToDoList toDoList);
	
	public ToDoList updateList(ToDoList toDoList);


}
