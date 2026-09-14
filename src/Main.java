import service.ProgressService;
import service.UserService;
import service.WorkoutService;
import ui.MainMenu;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        WorkoutService workoutService = new WorkoutService();
        ProgressService progressService = new ProgressService();

        userService.load();
        workoutService.load();
        progressService.load();

        MainMenu mainMenu = new MainMenu(userService, workoutService, progressService);
        mainMenu.start();

        userService.save();
        workoutService.save();
        progressService.save();
    }
}
