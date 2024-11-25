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

        userService.getAllUsers().forEach(user ->
                System.out.println(user.getName() + " " + user.getLastName()));

        userService.cleanUsersTable();
    }
}
