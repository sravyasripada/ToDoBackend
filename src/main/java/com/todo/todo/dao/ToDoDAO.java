package com.todo.todo.dao;

import com.todo.todo.entity.ToDo;

import java.util.List;

public interface ToDoDAO {
    public List<ToDo> findAll();
}
