package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("John", "Doe", (byte) 25);
        userService.saveUser("Jane", "Smith", (byte) 30);
        userService.saveUser("Paula", "Johnson", (byte) 20);
        userService.saveUser("Stephen", "Bowen", (byte) 48);

        userService.getAllUsers().forEach(user -> System.out.println(user));

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
