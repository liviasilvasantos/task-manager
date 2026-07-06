package com.example.taskmanager.repository;

import com.example.taskmanager.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<Task, String> {
    List<Task> findByPriority(String priority);
    List<Task> findByStatus(String status);
    List<Task> findByDueDate(LocalDate dueDate);
}
