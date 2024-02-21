package com.numetry.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numetry.todolist.dao.ToDoListDao;
import com.numetry.todolist.entities.ToDoList;

@Service
public class ToDoListServiceImp implements ToDoListService {

	@Autowired
	private ToDoListDao toDoListDao;
	
	@Override
	public List<ToDoList> getList() {
		
		return toDoListDao.findAll();
	}

	@Override
	public ToDoList saveList(ToDoList toDoList) {
		
		return toDoListDao.save(toDoList);
	}

	@Override
	public ToDoList updateList(ToDoList toDoList) {
		
		return toDoListDao.save(toDoList);
	}
	
	

}
