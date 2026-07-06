# Quickstart: Task Manager

## Prerequisites

- Java 21
- Redis running locally or in a container
- A terminal with access to the project source

## Setup

1. Start Redis on the default local port.
2. Open the project root in a terminal.
3. Run the application with the standard Spring Boot entry point.

## Validation Steps

1. Create a task by sending a request with title, description, due date, category, priority, and status.
2. Retrieve the task list and confirm the item appears.
3. Apply filters by priority, status, and due date and verify that the list updates accordingly.
4. Update an existing task status and confirm the change is reflected.

## Expected Outcome

The application should allow a user to create, review, filter, and update tasks through simple HTTP interactions without requiring an automated test suite.
