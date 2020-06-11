package com.example.youtubetodolist.controller;

import com.example.youtubetodolist.model.TodoItem;
import com.example.youtubetodolist.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {


    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@Valid @NonNull @RequestBody TodoItem todoItem) {
        return todoRepo.save(todoItem);

    }

    @PutMapping
    public TodoItem update(@Valid @NonNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        todoRepo.deleteById(id);
    }



}
