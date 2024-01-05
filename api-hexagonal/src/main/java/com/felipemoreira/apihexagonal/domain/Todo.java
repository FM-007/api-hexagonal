package com.felipemoreira.apihexagonal.domain;

import java.util.Objects;

public class Todo {
    private Integer id;
    private String description;
    private Boolean done;

    public Todo() {
    }

    public Todo(Integer id, String description, Boolean done) {
        this.id = id;
        this.description = description;
        this.done = done;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Todo todo = (Todo) o;
        return Objects.equals(id, todo.id) && Objects.equals(description,
            todo.description) && Objects.equals(done, todo.done);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, done);
    }

    @Override
    public String toString() {
        return "Todo{" +
            "id=" + id +
            ", description='" + description + '\'' +
            ", done=" + done +
            '}';
    }
}
