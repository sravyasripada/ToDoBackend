package com.todo.todo.Service;

import com.todo.todo.dao.ToDoDAO;
import com.todo.todo.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService
{
    //define field for todoDao
    private ToDoDAO toDoDAO;

    //setup constructor injection
    @Autowired
    public ToDoServiceImpl(ToDoDAO theToDoDAO){
        toDoDAO=theToDoDAO;
    }

    @Transactional
    public List<ToDo> findAll() {
        return toDoDAO.findAll();
    }


}
