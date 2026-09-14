package service;

import java.util.List;
import model.FitnessGoal;
import model.Progress;

public class ProgressService {

    public static final String PROGRESS_FILE = "data/progress.csv";
    public static final String GOALS_FILE = "data/goals.csv";

    public ProgressService() {
        // TODO: implement
    }

    public void recordProgress(Progress progress) {
        // TODO: implement
    }

    public Progress getProgressById(String id) {
        // TODO: implement
        return null;
    }

    public List<Progress> getProgressByUserId(String userId) {
        // TODO: implement
        return null;
    }

    public void deleteProgress(String id) {
        // TODO: implement
    }

    public void setFitnessGoal(FitnessGoal goal) {
        // TODO: implement
    }

    public FitnessGoal getFitnessGoalByUserId(String userId) {
        // TODO: implement
        return null;
    }

    public void updateFitnessGoal(FitnessGoal goal) {
        // TODO: implement
    }

    /** Writes progress records and fitness goals to their CSV files. */
    public void save() {
        // TODO: implement (Julius) - persistence
    }

    /** Loads progress records and fitness goals. Starts empty if the files are missing. */
    public void load() {
        // TODO: implement (Julius) - persistence
    }
}
