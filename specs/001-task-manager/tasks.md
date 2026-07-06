# Tasks: Task Manager

**Input**: Design documents from `/specs/001-task-manager/`

**Prerequisites**: plan.md (required), spec.md (required for user stories), research.md, data-model.md, contracts/

**Tests**: Automated test tasks are not part of this project by default. Only include them if the feature specification explicitly requires them for a high-risk change.

**Organization**: Tasks are grouped by user story to enable independent implementation and testing of each story.

## Format: `[ID] [P?] [Story] Description`

- **[P]**: Can run in parallel (different files, no dependencies)
- **[Story]**: Which user story this task belongs to (e.g., US1, US2, US3)
- Include exact file paths in descriptions

## Phase 1: Setup (Shared Infrastructure)

**Purpose**: Project initialization and basic structure

- [x] T001 Create the Spring Boot project structure under src/main/java/com/example/taskmanager and related resources folders
- [x] T002 Initialize the Java 21 project with Spring Boot, Spring Web, Validation, and Spring Data Redis dependencies
- [x] T003 [P] Configure application properties for Redis connection and basic application settings in src/main/resources/application.properties

---

## Phase 2: Foundational (Blocking Prerequisites)

**Purpose**: Core infrastructure that MUST be complete before any user story can be implemented

**⚠️ CRITICAL**: No user story work can begin until this phase is complete

- [x] T004 Create the Task domain model in src/main/java/com/example/taskmanager/model/Task.java
- [x] T005 Create DTOs for task creation and update in src/main/java/com/example/taskmanager/dto/TaskRequest.java and src/main/java/com/example/taskmanager/dto/TaskResponse.java
- [x] T006 Implement a Redis-backed repository for task persistence in src/main/java/com/example/taskmanager/repository/TaskRepository.java
- [x] T007 Implement task service logic for create, read, update, and filter operations in src/main/java/com/example/taskmanager/service/TaskService.java
- [x] T008 Implement REST endpoints for task management in src/main/java/com/example/taskmanager/controller/TaskController.java
- [x] T009 Configure validation and error handling for invalid task input in src/main/java/com/example/taskmanager/controller/TaskController.java and src/main/java/com/example/taskmanager/service/TaskService.java

**Checkpoint**: Foundation ready - user story implementation can now begin in parallel

---

## Phase 3: User Story 1 - Create and track daily tasks (Priority: P1) 🎯 MVP

**Goal**: Allow the user to create and review daily tasks with all required information.

**Independent Test**: A user can create a task and see it appear in the task list with the correct fields.

### Verification for User Story 1

- [x] T010 [US1] Perform manual verification for task creation and listing through local execution
- [x] T011 [US1] Record any issues found during manual validation

### Implementation for User Story 1

- [x] T012 [P] [US1] Create the Task entity and supporting fields in src/main/java/com/example/taskmanager/model/Task.java
- [x] T013 [US1] Implement task creation and retrieval flows in src/main/java/com/example/taskmanager/service/TaskService.java
- [x] T014 [US1] Implement POST and GET endpoints for task creation and listing in src/main/java/com/example/taskmanager/controller/TaskController.java
- [x] T015 [US1] Add validation for required task fields in src/main/java/com/example/taskmanager/dto/TaskRequest.java

**Checkpoint**: At this point, User Story 1 should be fully functional and testable independently

---

## Phase 4: User Story 2 - Filter tasks by different criteria (Priority: P2)

**Goal**: Let the user view tasks filtered by priority, status, or due date.

**Independent Test**: A user can apply one or more filters and view only matching tasks.

### Verification for User Story 2

- [x] T016 [US2] Perform manual verification for filtering by priority, status, and due date through local execution
- [x] T017 [US2] Record any issues found during manual validation

### Implementation for User Story 2

- [x] T018 [P] [US2] Add filtering support to the repository layer in src/main/java/com/example/taskmanager/repository/TaskRepository.java
- [x] T019 [US2] Implement filtering logic in src/main/java/com/example/taskmanager/service/TaskService.java
- [x] T020 [US2] Expose filtering parameters through the task listing endpoint in src/main/java/com/example/taskmanager/controller/TaskController.java

**Checkpoint**: At this point, User Stories 1 and 2 should both work independently

---

## Phase 5: User Story 3 - Manage task progress over time (Priority: P2)

**Goal**: Let the user update task status as work progresses toward completion.

**Independent Test**: A user can change a task status from pending to in progress and completed.

### Verification for User Story 3

- [x] T021 [US3] Perform manual verification for status updates through local execution
- [x] T022 [US3] Record any issues found during manual validation

### Implementation for User Story 3

- [x] T023 [P] [US3] Add update support for task status and related fields in src/main/java/com/example/taskmanager/dto/TaskRequest.java
- [x] T024 [US3] Implement update logic in src/main/java/com/example/taskmanager/service/TaskService.java
- [x] T025 [US3] Expose task update endpoints in src/main/java/com/example/taskmanager/controller/TaskController.java

**Checkpoint**: All user stories should now be independently functional

---

## Phase 6: Polish & Cross-Cutting Concerns

**Purpose**: Improvements that affect multiple user stories

- [x] T026 [P] Update application documentation in README.md or docs/ with setup and usage guidance
- [x] T027 Refactor shared task handling code for clarity and consistency in src/main/java/com/example/taskmanager
- [x] T028 [P] Perform manual validation for edge cases such as empty filters and missing task titles in local execution
- [x] T029 Run the quickstart validation steps from specs/001-task-manager/quickstart.md

---

## Dependencies & Execution Order

### Phase Dependencies

- **Setup (Phase 1)**: No dependencies - can start immediately
- **Foundational (Phase 2)**: Depends on Setup completion - BLOCKS all user stories
- **User Stories (Phase 3+)**: All depend on Foundational phase completion
- **Polish (Final Phase)**: Depends on all desired user stories being complete

### User Story Dependencies

- **User Story 1 (P1)**: Can start after Foundational (Phase 2) - No dependencies on other stories
- **User Story 2 (P2)**: Can start after Foundational (Phase 2) - May integrate with US1 but should be independently testable
- **User Story 3 (P2)**: Can start after Foundational (Phase 2) - May integrate with US1/US2 but should be independently testable

### Parallel Opportunities

- T003 can run in parallel with T001 and T002
- T012 can run in parallel with T013 and T014 if the service and controller are developed independently
- T018 can run in parallel with T019 and T020 after the foundation is ready
- T023 can run in parallel with T024 and T025 after the foundation is ready

---

## Implementation Strategy

### MVP First (User Story 1 Only)

1. Complete Phase 1: Setup
2. Complete Phase 2: Foundational
3. Complete Phase 3: User Story 1
4. **STOP and VALIDATE**: Verify task creation and listing independently
5. Deploy/demo if ready

### Incremental Delivery

1. Complete Setup + Foundational -> Foundation ready
2. Add User Story 1 -> Validate independently -> Deploy/demo
3. Add User Story 2 -> Validate independently -> Deploy/demo
4. Add User Story 3 -> Validate independently -> Deploy/demo
5. Each story adds value without breaking previous stories
