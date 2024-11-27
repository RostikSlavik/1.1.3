package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        User user1 = new User("John", "Doe", (byte) 25);
        User user2 = new User("Jane", "Smith", (byte) 30);
        User user3 = new User("Paula", "Johnson", (byte) 20);
        User user4 = new User("Stephen", "Bowen", (byte) 48);

        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);
        userService.saveUser(user4);

        userService.getAllUsers().forEach(user -> System.out.println(user));

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
