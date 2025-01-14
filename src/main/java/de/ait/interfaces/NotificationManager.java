
package de.ait.interfaces;

/**
 * This is the main class to manage notifications and demonstrate their functionality.
 * It uses the Notifiable interface and its implementations to send notifications and check their status.
 *
 * Это основной класс для управления уведомлениями и демонстрации их функциональности.
 * Он использует интерфейс Notifiable и его реализации для отправки уведомлений и проверки их статуса.
 */
public class NotificationManager {
    public static void main(String[] args) {
        // Creating an EmailNotifier instance to send notifications
        // Создание экземпляра EmailNotifier для отправки уведомлений
        Notifiable notifiable = new EmailNotifier();
        notifiable.sendNotification("user_221", "Вам новое сообщение в соцсети");

        // Checking the notification status
        // Проверка статуса уведомления
        notifiable.checkNotificationStatus();

        // Printing the current notification settings using a static method
        // Вывод текущих настроек уведомлений с использованием статического метода
        Notifiable.printNotificationSettings();
    }
}
