# FitnessTracker

A modular Java console application for tracking fitness routines, workouts, goals, and personal progress.

---

## Project Overview

FitnessTracker is designed to manage users, track workout routines and exercises, log completed workout sessions, and monitor personal health goals and progress over time through a clean command-line interface.

---

## Architecture & Layer Rules

The application follows a strict layered architecture pattern:

```
Main → UI (MainMenu) → Services (User/Workout/Progress) → Models → Storage (data/)
```

### Layer Constraints:
1. **UI (`ui/`)**:
   - Only communicates with the **Services** layer.
   - Never accesses or imports **Models** or **Storage** directly.
2. **Services (`service/`)**:
   - Owns all business logic.
   - The only layer permitted to instantiate or mutate **Models**.
   - Interfaces between UI and Storage.
3. **Models (`model/`)**:
   - Plain Old Java Objects (POJOs) containing fields, constructors, getters, setters, and `toString()`.
   - No business logic beyond simple derived getters.
4. **Storage (`data/`)**:
   - Persistence layer for saving and loading data.
   - Currently empty; to be implemented in a future milestone.

---

## Project Structure

```
FitnessTracker/
├── src/
│   ├── model/
│   │   ├── User.java
│   │   ├── FitnessGoal.java
│   │   ├── Exercise.java
│   │   ├── Workout.java
│   │   ├── WorkoutSession.java
│   │   └── Progress.java
│   ├── service/
│   │   ├── UserService.java
│   │   ├── WorkoutService.java
│   │   └── ProgressService.java
│   ├── ui/
│   │   └── MainMenu.java
│   └── Main.java
├── data/
└── README.md
```

---

## Current Status

> **Skeleton-only**: This repository currently contains the initial structural skeleton only. No business logic, persistence mechanisms, or functional UI workflows have been implemented yet. Method stubs are in place with compilation checks verified.