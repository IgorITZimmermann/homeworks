package de.ait.homework30;

import java.util.List;

/**
 * The UserMessgesManager class demonstrates the usage of the UserMessenger class
 * by sending messages to users and retrieving their message histories.
 *
 * Класс UserMessgesManager демонстрирует использование класса UserMessenger,
 * отправляя сообщения пользователям и получая историю их сообщений.
 */
public class UserMessgesManager {
    public static void main(String[] args) {
        // Create an instance of UserMessenger
        // Создание экземпляра UserMessenger
        UserMessenger messenger = new UserMessenger();

        // Send messages to users
        // Отправка сообщений пользователям
        messenger.sendMessage("Hello my friend", "1");
        messenger.sendMessage("Have a good day", "2");
        messenger.sendMessage("Do You have time now?", "1");

        // Retrieve and display message history for user 1
        // Получение и отображение истории сообщений для пользователя 1
        List<String> userOneMessages = messenger.receiveMessages("1");
        System.out.println(userOneMessages);

        // Retrieve and display message history for user 2
        // Получение и отображение истории сообщений для пользователя 2
        List<String> userTwoMessages = messenger.receiveMessages("2");
        System.out.println(userTwoMessages);
    }
}
