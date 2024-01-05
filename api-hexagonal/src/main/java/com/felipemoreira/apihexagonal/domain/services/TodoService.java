package com.felipemoreira.apihexagonal.domain.services;

import com.felipemoreira.apihexagonal.domain.Todo;
import com.felipemoreira.apihexagonal.domain.posts.TodoRepositoryPort;
import com.felipemoreira.apihexagonal.domain.posts.TodoServicePort;
import java.util.List;

public class TodoService implements TodoServicePort {

    private final TodoRepositoryPort repositoryPort;

    public TodoService(TodoRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    @Override
    public Todo saveTodo(Todo todo) {
        return repositoryPort.saveTodo(todo);
    }

    @Override
    public List<Todo> findAllTodo() {
        return repositoryPort.findAllTodo();
    }
}
