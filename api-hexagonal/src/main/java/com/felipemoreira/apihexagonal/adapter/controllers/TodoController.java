package com.felipemoreira.apihexagonal.adapter.controllers;

import com.felipemoreira.apihexagonal.domain.Todo;
import com.felipemoreira.apihexagonal.domain.posts.TodoServicePort;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
@AllArgsConstructor
public class TodoController {

    private final TodoServicePort todoServicePort;

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return todoServicePort.saveTodo(todo);
    }

    @GetMapping
    public List<Todo> findAll() {
        return todoServicePort.findAllTodo();
    }
}
