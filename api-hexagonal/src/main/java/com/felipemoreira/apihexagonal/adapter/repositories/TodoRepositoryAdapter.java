package com.felipemoreira.apihexagonal.adapter.repositories;

import com.felipemoreira.apihexagonal.adapter.entities.TodoEntity;
import com.felipemoreira.apihexagonal.domain.Todo;
import com.felipemoreira.apihexagonal.domain.posts.TodoRepositoryPort;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TodoRepositoryAdapter implements TodoRepositoryPort {

    private final TodoRepository todoRepository;
    private final ModelMapper modelMapper;

    @Override
    public Todo saveTodo(Todo todo) {
        TodoEntity todoEntity = modelMapper.map(todo, TodoEntity.class);

        TodoEntity createdEntity = todoRepository.save(todoEntity);

        return modelMapper.map(createdEntity, Todo.class);
    }

    @Override
    public List<Todo> findAllTodo() {
        List<TodoEntity> all = todoRepository.findAll();

        return all
            .stream()
            .map(todoEntity -> modelMapper.map(todoEntity, Todo.class))
            .collect(Collectors.toList());
    }
}
