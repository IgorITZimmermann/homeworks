
package de.ait.interproblem;

/**
 * This interface defines a default logging behavior.
 * It provides a method to log messages with a specific prefix ("LoggerB").
 *
 * Этот интерфейс определяет поведение по умолчанию для ведения логов.
 * Он предоставляет метод для записи сообщений с определенным префиксом ("LoggerB").
 */
public interface LoggerB {

    /**
     * Logs a message with the "LoggerB" prefix.
     *
     * Записывает сообщение с префиксом "LoggerB".
     *
     * @param message The message to log. / Сообщение для записи в лог.
     */
    default void log(String message) {
        System.out.println("LoggerB: " + message);
    }
}
