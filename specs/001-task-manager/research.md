# Phase 0 Research: Task Manager

## Decision: Use Spring Boot with Redis-backed task storage

**Rationale**: The feature requires a simple persistence layer and the user explicitly requested Redis. Spring Boot provides a straightforward way to expose task management endpoints without introducing unnecessary complexity.

## Decision: Use simple REST-style HTTP endpoints for task operations

**Rationale**: A web-service style interface is appropriate for a task manager and supports create, read, update, and filtering workflows with minimal overhead.

## Decision: Use enum-based status values and simple validation rules

**Rationale**: The specification defines a small, fixed set of statuses and the data model benefits from explicit constraints that are easy to understand and maintain.

## Alternatives considered

- In-memory storage: Rejected because it would not persist data across restarts.
- Relational database: Rejected because the user specifically requested Redis and the project scope is intentionally small.
- Full-stack UI framework: Rejected because the requirement is focused on task management and a simple web service is sufficient for this version.
