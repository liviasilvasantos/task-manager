package com.example.taskmanager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public class TaskRequest {
    @NotBlank(message = "Title is required")
    private String title;

    private String description;
    private LocalDate dueDate;
    private String category;

    @Pattern(regexp = "low|medium|high", message = "Priority must be low, medium, or high")
    private String priority;

    @Pattern(regexp = "pending|in progress|completed", message = "Status must be pending, in progress, or completed")
    private String status;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
