package model;

import java.time.LocalDateTime;

public class WorkoutSession {
    private String id;
    private String userId;
    private String workoutId;
    private LocalDateTime sessionDate;
    private int durationMinutes;
    private double caloriesBurned;

    public WorkoutSession() {
    }

    public WorkoutSession(String id, String userId, String workoutId, LocalDateTime sessionDate, int durationMinutes, double caloriesBurned) {
        this.id = id;
        this.userId = userId;
        this.workoutId = workoutId;
        this.sessionDate = sessionDate;
        this.durationMinutes = durationMinutes;
        this.caloriesBurned = caloriesBurned;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(String workoutId) {
        this.workoutId = workoutId;
    }

    public LocalDateTime getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDateTime sessionDate) {
        this.sessionDate = sessionDate;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    @Override
    public String toString() {
        return "WorkoutSession{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", workoutId='" + workoutId + '\'' +
                ", sessionDate=" + sessionDate +
                ", durationMinutes=" + durationMinutes +
                ", caloriesBurned=" + caloriesBurned +
                '}';
    }
}
