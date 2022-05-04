package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {

        UserService us = new UserServiceImpl();

        us.createUsersTable();

        us.saveUser("Anton", "Elchin", (byte) 30);
        us.saveUser("Kirill", "Isa", (byte) 11);
        us.saveUser("Ivan", "Stone", (byte) 32);
        us.saveUser("Irina", "Polle", (byte) 38);

        us.removeUserById(2);
        us.getAllUsers();
        us.cleanUsersTable();
        us.dropUsersTable();
    }
}
