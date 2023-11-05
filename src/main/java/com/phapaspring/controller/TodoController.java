package com.phapaspring.controller;

import com.phapaspring.Model.Todo;
import com.phapaspring.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/todo")
public class TodoController {

    @Autowired
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("")
    public ResponseEntity<?> getTodos () {
        List<Todo> todos = todoService.getAllTodos();
        return BaseController.success(todos);
    }

    @PostMapping("")
    public ResponseEntity<?> saveTodo (@RequestBody Todo todo) {
        Todo newTodo = todoService.save(todo);
        return BaseController.created(newTodo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTodoById (@PathVariable("id") BigInteger id) {
        Todo todo = todoService.getById(id);
        return BaseController.success(todo);
    }


}

