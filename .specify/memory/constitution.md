<!--
Sync Impact Report
- Version change: 0.0.0 -> 1.0.0
- Modified principles: none -> Simplicity First, Clean Code by Default, Pragmatic Spring Boot Usage, Lean Validation
- Added sections: Project Constraints, Development Workflow
- Removed sections: none
- Templates requiring updates: ✅ .specify/templates/plan-template.md, ✅ .specify/templates/spec-template.md, ✅ .specify/templates/tasks-template.md
- Follow-up TODOs: none
-->

# Todo Constitution

## Core Principles

### I. Simplicity First
This project MUST stay small, focused, and easy to reason about. New features MUST solve the immediate need without introducing unnecessary abstractions, speculative layers, or framework churn. When trade-offs exist, the simplest option that satisfies the current requirement MUST be chosen.

### II. Clean Code by Default
Code MUST be easy to read and maintain. Names MUST be explicit, classes and methods MUST have a single responsibility, and complexity MUST be reduced through small functions, clear structure, and consistent formatting. Duplication MUST be avoided when it would make the system harder to change.

### III. Pragmatic Spring Boot Usage
The application MUST use a Java 21-compatible Spring Boot version and follow standard Spring conventions without over-engineering. Configuration, dependency injection, and package structure MUST remain straightforward and aligned with the small scope of the project.

### IV. Lean Validation
This project MUST NOT introduce automated test suites by default. Validation MUST rely on straightforward manual checks, local execution, and simple verification steps appropriate for a small application. Automated tests MAY be added only if a change introduces meaningful risk and the team explicitly decides they are necessary.

## Project Constraints
The project MUST use Java 21.
The project MUST use a Spring Boot version compatible with Java 21.
The application MUST remain small and simple; avoid multi-module architecture, heavy domain layers, and unnecessary abstractions.
The project MUST prefer direct, understandable implementations over generic frameworks or elaborate patterns.
The project MUST keep documentation and configuration concise.

## Development Workflow
Changes MUST preserve readability and keep the implementation understandable to a new contributor. Before introducing new dependencies or architectural patterns, the team MUST verify that the simpler solution is insufficient. Any change that increases complexity MUST include a clear justification and be limited to the smallest necessary scope.

## Governance
This constitution supersedes ad hoc practices for this repository. Any amendment MUST update this document, describe the rationale, and adjust dependent templates or guidance when the change affects planning, specification, or delivery expectations. Compliance reviews MUST confirm that implementation decisions remain consistent with these principles, especially simplicity, clean code, and the decision to avoid automated tests by default.

**Version**: 1.0.0 | **Ratified**: 2026-07-05 | **Last Amended**: 2026-07-05
