package com.numetry.todolist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.numetry.todolist.entities.ToDoList;

@Repository
public interface ToDoListDao extends JpaRepository<ToDoList, Long>{

}
