# Feature Specification: Task Manager

**Feature Branch**: 001-task-manager

**Created**: 2026-07-05

**Status**: Draft

**Input**: User description: "Construa uma aplicação que me ajude a gerenciar minhas tarefas, que eu crie e acompanhe atividades do dia a dia. As tarefas devem ter título, descrição, data de conclusão, categoria, prioridade e status (pendente, em andamento, concluída). Inclua filtros pra visualizar tarefas por prioridade, status ou data."

## User Scenarios & Testing *(mandatory)*

### User Story 1 - Create and track daily tasks (Priority: P1)

Um usuário quer registrar rapidamente suas atividades do dia a dia com todas as informações essenciais para acompanhar o progresso.

**Why this priority**: This is the core value of the product because the user cannot manage tasks without being able to create them first.

**Independent Test**: A user can create a new task with title, description, due date, category, priority, and status, and then see it listed.

**Acceptance Scenarios**:

1. **Given** the user is on the task list, **When** they create a new task with all required fields, **Then** the task appears in the list with the provided information.
2. **Given** a task exists, **When** the user updates its status or due date, **Then** the updated information is shown in the task list.

---

### User Story 2 - Filter tasks by different criteria (Priority: P2)

Um usuário quer localizar tarefas específicas com base em prioridade, status ou data de conclusão.

**Why this priority**: Filtering is essential for keeping the list useful as the number of tasks grows.

**Independent Test**: A user can apply one or more filters and view only the tasks that match the chosen criteria.

**Acceptance Scenarios**:

1. **Given** multiple tasks exist, **When** the user filters by priority, **Then** only tasks with that priority are displayed.
2. **Given** multiple tasks exist, **When** the user filters by status and due date, **Then** only tasks matching both criteria are displayed.

---

### User Story 3 - Manage task progress over time (Priority: P2)

Um usuário quer acompanhar a evolução das atividades desde o cadastro até a conclusão.

**Why this priority**: Progress tracking turns the task list into a practical daily planning tool.

**Independent Test**: A user can change a task status from pending to in progress and then to completed.

**Acceptance Scenarios**:

1. **Given** a pending task exists, **When** the user marks it as in progress, **Then** its status changes accordingly.
2. **Given** a task is in progress, **When** the user marks it as completed, **Then** it is shown as completed in the list.

---

### Edge Cases

- What happens when the user tries to save a task without a title?
- How does the system handle a task with a due date that is already past?
- What happens when the user applies multiple filters that result in no matching tasks?

## Requirements *(mandatory)*

### Project Constraints

- The solution MUST remain small and simple.
- The implementation MUST use Java 21 with a Spring Boot version compatible with Java 21.
- Automated tests are not required by default for this project.

### Functional Requirements

- **FR-001**: The system MUST allow users to create a task with a title, description, due date, category, priority, and status.
- **FR-002**: The system MUST display created tasks in a list that can be reviewed by the user.
- **FR-003**: The system MUST allow users to update the information of an existing task.
- **FR-004**: The system MUST allow users to change the status of a task among pending, in progress, and completed.
- **FR-005**: The system MUST allow users to filter tasks by priority.
- **FR-006**: The system MUST allow users to filter tasks by status.
- **FR-007**: The system MUST allow users to filter tasks by due date.
- **FR-008**: The system MUST provide a clear view of which tasks are pending, in progress, or completed.

### Key Entities *(include if feature involves data)*

- **Task**: Represents an activity to be managed, with title, description, due date, category, priority, and status.
- **Task List**: Represents the collection of tasks visible to the user at a given moment, including the currently applied filters.

## Success Criteria *(mandatory)*

### Measurable Outcomes

- **SC-001**: A user can create, update, and locate a task in less than 2 minutes.
- **SC-002**: A user can apply at least one filter and find the relevant tasks without assistance in less than 1 minute.
- **SC-003**: At least 90% of test users can complete the main task-management flow successfully on the first attempt.
- **SC-004**: Users can clearly distinguish pending, in progress, and completed tasks in the main view.

## Assumptions

- The user manages tasks for personal daily planning rather than team collaboration.
- Each task must contain all core fields at creation time.
- Due dates are handled as calendar dates without time-specific scheduling.
- The product will focus on simple task management rather than advanced reporting or synchronization.
