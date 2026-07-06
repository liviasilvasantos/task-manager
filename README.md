# Task Manager

A simple Spring Boot task manager that stores tasks in Redis and supports creating, updating, listing, and filtering tasks.

## Run locally

1. Start Redis locally on port 6379 using docker-compose `docker-compose up`.
2. Run `mvn spring-boot:run`.
3. Open `http://localhost:8080`.

Alternatively, you can use the Bruno collection in test-collections/tasks-manager-collection.yml.