package com.felipemoreira.apihexagonal.config;

import com.felipemoreira.apihexagonal.domain.posts.TodoRepositoryPort;
import com.felipemoreira.apihexagonal.domain.posts.TodoServicePort;
import com.felipemoreira.apihexagonal.domain.services.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public TodoServicePort todoServicePort(TodoRepositoryPort todoRepositoryPort) {
        return new TodoService(todoRepositoryPort);
    }
}
