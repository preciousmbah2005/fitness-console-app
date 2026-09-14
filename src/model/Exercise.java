package model;

public class Exercise {
    private String id;
    private String name;
    private String category;
    private String description;
    private int defaultDurationMinutes;
    private double caloriesBurnedPerMinute;

    public Exercise() {
    }

    public Exercise(String id, String name, String category, String description, int defaultDurationMinutes, double caloriesBurnedPerMinute) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.defaultDurationMinutes = defaultDurationMinutes;
        this.caloriesBurnedPerMinute = caloriesBurnedPerMinute;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDefaultDurationMinutes() {
        return defaultDurationMinutes;
    }

    public void setDefaultDurationMinutes(int defaultDurationMinutes) {
        this.defaultDurationMinutes = defaultDurationMinutes;
    }

    public double getCaloriesBurnedPerMinute() {
        return caloriesBurnedPerMinute;
    }

    public void setCaloriesBurnedPerMinute(double caloriesBurnedPerMinute) {
        this.caloriesBurnedPerMinute = caloriesBurnedPerMinute;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", defaultDurationMinutes=" + defaultDurationMinutes +
                ", caloriesBurnedPerMinute=" + caloriesBurnedPerMinute +
                '}';
    }
}
