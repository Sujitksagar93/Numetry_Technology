package com.numetry.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.numetry.todolist.entities.ToDoList;
import com.numetry.todolist.service.ToDoListServiceImp;

@CrossOrigin
@RestController
public class ToDoListController {
	
	@Autowired
	private ToDoListServiceImp toDoListServiceImp;
	
	@GetMapping("/lists")
	public List<ToDoList> getList()
	{
		return toDoListServiceImp.getList();
	}
	
	@PostMapping("/lists")
	public ToDoList saveList(@RequestBody ToDoList toDoList)
	{
		return toDoListServiceImp.saveList(toDoList);
		
	}
	
	@PutMapping("/lists")
	public ToDoList updateList(@RequestBody ToDoList toDoList)
	{
		return toDoListServiceImp.updateList(toDoList);
	}

}
