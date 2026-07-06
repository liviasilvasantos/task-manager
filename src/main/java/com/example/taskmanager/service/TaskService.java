package com.example.taskmanager.service;

import com.example.taskmanager.dto.TaskRequest;
import com.example.taskmanager.dto.TaskResponse;
import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskResponse createTask(TaskRequest request) {
        Task task = new Task();
        task.setId(UUID.randomUUID().toString());
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setDueDate(request.getDueDate());
        task.setCategory(request.getCategory());
        task.setPriority(request.getPriority());
        task.setStatus(request.getStatus() == null ? "pending" : request.getStatus());
        LocalDateTime now = LocalDateTime.now();
        task.setCreatedAt(now);
        task.setUpdatedAt(now);

        Task savedTask = repository.save(task);
        return toResponse(savedTask);
    }

    public List<TaskResponse> listTasks(String priority, String status, LocalDate dueDate) {
        List<Task> tasks = new ArrayList<>();
        repository.findAll().forEach(tasks::add);

        return tasks.stream()
                .filter(task -> priority == null || priority.isBlank() || priority.equals(task.getPriority()))
                .filter(task -> status == null || status.isBlank() || status.equals(task.getStatus()))
                .filter(task -> dueDate == null || dueDate.equals(task.getDueDate()))
                .map(this::toResponse)
                .toList();
    }

    public TaskResponse updateTask(String id, TaskRequest request) {
        Task task = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Task not found"));
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setDueDate(request.getDueDate());
        task.setCategory(request.getCategory());
        task.setPriority(request.getPriority());
        task.setStatus(request.getStatus());
        task.setUpdatedAt(LocalDateTime.now());
        return toResponse(repository.save(task));
    }

    private TaskResponse toResponse(Task task) {
        return new TaskResponse(task.getId(), task.getTitle(), task.getDescription(), task.getDueDate(),
                task.getCategory(), task.getPriority(), task.getStatus(), task.getCreatedAt(), task.getUpdatedAt());
    }
}
