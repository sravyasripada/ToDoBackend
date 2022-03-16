package com.todo.todo.RestController;
import com.todo.todo.Service.ToDoService;
import com.todo.todo.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
@CrossOrigin
public class ToDoRestController {

    //define field for ToDo Service
    private ToDoService toDoService;

    //setup constructor injection
    @Autowired
    public ToDoRestController(ToDoService theToDoService){
        toDoService=theToDoService;
    }
    //add mapping for "/todos" and return list of todos
    @GetMapping("/todos")
    public List<ToDo> findAll(){
        return toDoService.findAll();
    }
}
