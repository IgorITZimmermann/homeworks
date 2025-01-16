package de.ait.homework30;

import java.util.List;

/**
 * This interface defines a contract for sending and receiving messages.
 * Implementing classes will provide functionality to send messages to specific users and retrieve messages for a user.
 *
 * Этот интерфейс определяет контракт для отправки и получения сообщений.
 * Классы, реализующие данный интерфейс, должны предоставлять функциональность для отправки сообщений конкретным пользователям и получения сообщений для пользователя.
 */
public interface Messenger {

    /**
     * Sends a message to a specific user.
     *
     * @param message the content of the message
     * @param userId the ID of the recipient user
     *
     * Отправляет сообщение конкретному пользователю.
     *
     * @param message содержание сообщения
     * @param userId ID получателя сообщения
     */
    void sendMessage(String message, String userId);

    /**
     * Retrieves all messages for a specific user.
     *
     * @param userId the ID of the user whose messages are to be retrieved
     * @return a list of messages for the specified user
     *
     * Возвращает все сообщения для конкретного пользователя.
     *
     * @param userId ID пользователя, сообщения которого нужно получить
     * @return список сообщений для указанного пользователя
     */
    List<String> receiveMessages(String userId);

}
