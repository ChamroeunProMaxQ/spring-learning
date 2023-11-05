package com.phapaspring.service;


import com.phapaspring.Model.Todo;
import com.phapaspring.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private final TodoRepo todoRepo;

    public TodoService(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    public List<Todo> getAllTodos() {
        return todoRepo.findAll();
    }

    public Todo save(Todo todo) {
      return todoRepo.save(todo);
    }

//    public void deleteById(BigInteger id) {
//    }

    public Todo getById(BigInteger id) {
        return todoRepo.findById(id).orElse(null);
    }

//    public Todo updateById(BigInteger id,Todo todo) {
//
//    }



}
