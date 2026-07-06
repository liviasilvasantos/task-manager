# Data Model: Task Manager

## Task

A Task represents a single activity that a user wants to track.

| Field | Type | Constraints | Notes |
|-------|------|-------------|-------|
| id | string | required, unique | Generated identifier for the task |
| title | string | required, non-blank | Short summary of the task |
| description | string | optional | Additional details about the task |
| dueDate | date | optional | Date by which the task should be completed |
| category | string | optional | User-defined grouping for the task |
| priority | string | required | One of low, medium, high |
| status | string | required | One of pending, in progress, completed |
| createdAt | date-time | required | Timestamp when the task was created |
| updatedAt | date-time | required | Timestamp when the task was last updated |

## Validation Rules

- Title MUST be present and not empty.
- Priority MUST be one of low, medium, or high.
- Status MUST be one of pending, in progress, or completed.
- Due date MUST be stored as a date value.

## State Transitions

- pending -> in progress -> completed
- The user can move a task back to a previous state if needed, but the default flow is forward progression.
