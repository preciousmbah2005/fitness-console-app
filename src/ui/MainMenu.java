package ui;

import service.UserService;
import service.WorkoutService;
import service.ProgressService;
import java.util.Scanner;

public class MainMenu {
    private final UserService userService;
    private final WorkoutService workoutService;
    private final ProgressService progressService;
    private final Scanner scanner;

    public MainMenu(UserService userService, WorkoutService workoutService, ProgressService progressService) {
        this.userService = userService;
        this.workoutService = workoutService;
        this.progressService = progressService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("=== Fitness Tracker ===");
            System.out.println("1. User Management");
            System.out.println("2. Workout Management");
            System.out.println("3. Progress & Goals");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            if (!scanner.hasNextLine()) {
                break;
            }

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    // TODO: handle user management menu
                    break;
                case "2":
                    // TODO: handle workout management menu
                    break;
                case "3":
                    // TODO: handle progress and goals menu
                    break;
                case "0":
                    System.out.println("Exiting Fitness Tracker. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
