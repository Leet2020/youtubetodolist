package com.example.youtubetodolist.repo;

import com.example.youtubetodolist.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {


}
