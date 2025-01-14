
package de.ait.interfaces;

/**
 * This class implements the Notifiable interface to provide functionality for sending notifications via email.
 * It overrides the sendNotification method to specify email notification behavior.
 *
 * Этот класс реализует интерфейс Notifiable для предоставления функциональности отправки уведомлений по электронной почте.
 * Он переопределяет метод sendNotification для определения поведения уведомлений по email.
 */
public class EmailNotifier implements Notifiable {

    /**
     * Sends an email notification to a user with a specific message.
     *
     * Отправляет уведомление по электронной почте пользователю с определенным сообщением.
     *
     * @param userId The ID of the user to notify. / Идентификатор пользователя, которому отправляется уведомление.
     * @param message The message to send. / Сообщение для отправки.
     */
    @Override
    public void sendNotification(String userId, String message) {
        System.out.println("Отправляем email пользователю " + userId + " c текстом " + message);
    }
}
