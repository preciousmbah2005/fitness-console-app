package service;

import java.util.List;
import model.Exercise;
import model.Workout;
import model.WorkoutSession;

public class WorkoutService {

    public static final String EXERCISES_FILE = "data/exercises.csv";
    public static final String WORKOUTS_FILE = "data/workouts.csv";
    public static final String SESSIONS_FILE = "data/sessions.csv";

    public WorkoutService() {
        // TODO: implement
    }

    public void createWorkout(Workout workout) {
        // TODO: implement
    }

    public Workout getWorkoutById(String id) {
        // TODO: implement
        return null;
    }

    public List<Workout> getAllWorkouts() {
        // TODO: implement
        return null;
    }

    public void updateWorkout(Workout workout) {
        // TODO: implement
    }

    public void deleteWorkout(String id) {
        // TODO: implement
    }

    public void addExercise(Exercise exercise) {
        // TODO: implement
    }

    public Exercise getExerciseById(String id) {
        // TODO: implement
        return null;
    }

    public List<Exercise> getAllExercises() {
        // TODO: implement
        return null;
    }

    public void logWorkoutSession(WorkoutSession session) {
        // TODO: implement
    }

    public List<WorkoutSession> getWorkoutSessionsByUserId(String userId) {
        // TODO: implement
        return null;
    }

    /** Writes exercises, workouts and sessions to their CSV files. */
    public void save() {
        // TODO: implement (Julius) - persistence
    }

    /** Loads exercises, workouts and sessions. Starts empty if the files are missing. */
    public void load() {
        // TODO: implement (Julius) - persistence
    }
}
