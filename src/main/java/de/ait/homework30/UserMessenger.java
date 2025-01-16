package de.ait.homework30;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The UserMessenger class implements the Messenger interface and provides functionality
 * for sending and receiving messages between users.
 *
 * Класс UserMessenger реализует интерфейс Messenger и обеспечивает функции для отправки и получения сообщений между пользователями.
 */
@Slf4j
public class UserMessenger implements Messenger {

    // A map to store user IDs and their corresponding list of messages
    // Карта для хранения ID пользователей и связанных с ними списков сообщений
    private Map<String, List<String>> usersAndMessages;

    /**
     * Constructs a new UserMessenger with an empty map for storing messages.
     *
     * Конструирует новый UserMessenger с пустой картой для хранения сообщений.
     */
    public UserMessenger() {
        usersAndMessages = new HashMap<>();
    }

    /**
     * Sends a message to a specified user.
     *
     * @param message the content of the message to send
     * @param userId the ID of the recipient user
     *
     * Отправляет сообщение указанному пользователю.
     *
     * @param message текст сообщения
     * @param userId ID получателя
     */
    @Override
    public void sendMessage(String message, String userId) {
        if (message == null || message.isEmpty() || userId == null || userId.isEmpty()) {
            System.out.println("Message or user is empty or null");
            log.warn("Message or user is empty or null");
        } else {
            System.out.println("User " + userId + " sent message: " + message);
            List<String> userMessages = this.usersAndMessages.get(userId);
            if (userMessages == null) {
                userMessages = new ArrayList<>();
                userMessages.add(message);
                this.usersAndMessages.put(userId, userMessages);
                log.info("User {} sent message: {}", userId, message);
            } else {
                userMessages.add(message);
                this.usersAndMessages.put(userId, userMessages);
                log.info("User {} sent message: {}", userId, message);
            }
        }
    }

    /**
     * Retrieves the list of messages for a specified user.
     *
     * @param userId the ID of the user whose messages are to be retrieved
     * @return a list of messages for the user
     *
     * Возвращает список сообщений для указанного пользователя.
     *
     * @param userId ID пользователя
     * @return список сообщений для этого пользователя
     */
    @Override
    public List<String> receiveMessages(String userId) {
        List<String> userMessages = this.usersAndMessages.get(userId);
        return new ArrayList<>(userMessages);
    }
}
