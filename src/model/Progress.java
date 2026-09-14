package model;

import java.time.LocalDate;

public class Progress {
    private String id;
    private String userId;
    private LocalDate recordDate;
    private double currentWeight;
    private double caloriesBurnedTotal;
    private String notes;

    public Progress() {
    }

    public Progress(String id, String userId, LocalDate recordDate, double currentWeight, double caloriesBurnedTotal, String notes) {
        this.id = id;
        this.userId = userId;
        this.recordDate = recordDate;
        this.currentWeight = currentWeight;
        this.caloriesBurnedTotal = caloriesBurnedTotal;
        this.notes = notes;
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

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public double getCaloriesBurnedTotal() {
        return caloriesBurnedTotal;
    }

    public void setCaloriesBurnedTotal(double caloriesBurnedTotal) {
        this.caloriesBurnedTotal = caloriesBurnedTotal;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Progress{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", recordDate=" + recordDate +
                ", currentWeight=" + currentWeight +
                ", caloriesBurnedTotal=" + caloriesBurnedTotal +
                ", notes='" + notes + '\'' +
                '}';
    }
}
