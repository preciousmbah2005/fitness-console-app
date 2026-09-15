package service;

import java.util.List;
import model.User;

public class UserService {

    public static final String USERS_FILE = "data/users.csv";

    public UserService() {
        // TODO: implement
    }

    public void createUser(User user) {
        // TODO: implement
    }

    public User getUserById(String id) {
        // TODO: implement
        return null;
    }

    public List<User> getAllUsers() {
        // TODO: implement
        return null;
    }

    public void updateUser(User user) {
        // TODO: implement
    }

    public void deleteUser(String id) {
        // TODO: implement
    }

    /** Writes all users to {@link #USERS_FILE}. Safe to call even if nothing changed. */
    public void save() {
        // TODO: implement (Julius) - persistence
    }

    /** Loads users from {@link #USERS_FILE}. Starts empty if the file is missing. */
    public void load() {
        // TODO: implement (Julius) - persistence
    }
}
