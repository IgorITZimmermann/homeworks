
package de.ait.interfaces;

/**
 * This interface defines the contract for notification functionality.
 * It provides methods for sending notifications, checking their status, and printing settings.
 *
 * Этот интерфейс определяет контракт для функциональности уведомлений.
 * Он предоставляет методы для отправки уведомлений, проверки их статуса и вывода настроек.
 */
public interface Notifiable {

    /**
     * Sends a notification to a user with a specific message.
     *
     * Отправляет уведомление пользователю с определенным сообщением.
     *
     * @param userId The ID of the user to notify. / Идентификатор пользователя, которому отправляется уведомление.
     * @param message The message to send. / Сообщение для отправки.
     */
    void sendNotification(String userId, String message);

    /**
     * Checks the status of notifications to determine if all have been delivered.
     *
     * Проверяет статус уведомлений, чтобы определить, были ли они все доставлены.
     */
    default void checkNotificationStatus() {
        System.out.println("Проверяем, были ли все уведомления доставлены...");
    }

    /**
     * Prints the current notification settings.
     *
     * Выводит текущие настройки уведомлений.
     */
    static void printNotificationSettings() {
        System.out.println("Показать текущие настройки уведомления");
    }
}
