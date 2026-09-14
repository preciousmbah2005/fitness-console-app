import service.UserService;
import service.WorkoutService;
import service.ProgressService;
import ui.MainMenu;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        WorkoutService workoutService = new WorkoutService();
        ProgressService progressService = new ProgressService();

        MainMenu mainMenu = new MainMenu(userService, workoutService, progressService);
        mainMenu.start();
    }
}
