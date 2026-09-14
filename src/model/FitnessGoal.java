package model;

import java.time.LocalDate;

public class FitnessGoal {
    private String id;
    private String userId;
    private String goalType;
    private double targetValue;
    private double currentValue;
    private LocalDate targetDate;

    public FitnessGoal() {
    }

    public FitnessGoal(String id, String userId, String goalType, double targetValue, double currentValue, LocalDate targetDate) {
        this.id = id;
        this.userId = userId;
        this.goalType = goalType;
        this.targetValue = targetValue;
        this.currentValue = currentValue;
        this.targetDate = targetDate;
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

    public String getGoalType() {
        return goalType;
    }

    public void setGoalType(String goalType) {
        this.goalType = goalType;
    }

    public double getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(double targetValue) {
        this.targetValue = targetValue;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    @Override
    public String toString() {
        return "FitnessGoal{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", goalType='" + goalType + '\'' +
                ", targetValue=" + targetValue +
                ", currentValue=" + currentValue +
                ", targetDate=" + targetDate +
                '}';
    }
}
