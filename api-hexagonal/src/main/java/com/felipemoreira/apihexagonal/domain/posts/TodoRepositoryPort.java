package com.felipemoreira.apihexagonal.domain.posts;

import com.felipemoreira.apihexagonal.domain.Todo;
import java.util.List;

public interface TodoRepositoryPort {

    Todo saveTodo(Todo todo);

    List<Todo> findAllTodo();
}
