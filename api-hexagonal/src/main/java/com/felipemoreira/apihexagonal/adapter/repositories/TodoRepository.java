package com.felipemoreira.apihexagonal.adapter.repositories;

import com.felipemoreira.apihexagonal.adapter.entities.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

}
