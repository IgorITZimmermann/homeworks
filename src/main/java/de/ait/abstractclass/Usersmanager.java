package de.ait.abstractclass;

import java.util.ArrayList;
import java.util.List;

/**
 * The Usersmanager class demonstrates the management of users.
 * It creates a list of users, iterates through them, and performs their specific actions.
 *
 * Класс Usersmanager демонстрирует управление пользователями.
 * Он создаёт список пользователей, итерируется по ним и выполняет их специфичные действия.
 */
public class Usersmanager {
    public static void main(String[] args) {
        // Create a list to store users
        // Создание списка для хранения пользователей
        List<User> users = new ArrayList<>();

        // Add users to the list
        // Добавление пользователей в список
        users.add(new RegularUser("Max", 1));
        users.add(new AdminUser("John", 2));

        // Iterate through the list and perform user-specific actions
        // Итерация по списку и выполнение специфичных действий пользователей
        for (User user : users) {
            user.performAction();
        }
    }
}
