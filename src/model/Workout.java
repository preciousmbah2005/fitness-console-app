package model;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    private String id;
    private String name;
    private String description;
    private List<Exercise> exercises;
    private int totalDurationMinutes;

    public Workout() {
        this.exercises = new ArrayList<>();
    }

    public Workout(String id, String name, String description, List<Exercise> exercises, int totalDurationMinutes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.exercises = exercises != null ? exercises : new ArrayList<>();
        this.totalDurationMinutes = totalDurationMinutes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public int getTotalDurationMinutes() {
        return totalDurationMinutes;
    }

    public void setTotalDurationMinutes(int totalDurationMinutes) {
        this.totalDurationMinutes = totalDurationMinutes;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", exercises=" + exercises +
                ", totalDurationMinutes=" + totalDurationMinutes +
                '}';
    }
}
