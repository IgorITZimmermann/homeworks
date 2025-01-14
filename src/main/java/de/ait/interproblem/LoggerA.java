
package de.ait.interproblem;

/**
 * This interface defines a default logging behavior.
 * It provides a method to log messages with a specific prefix ("LoggerA").
 *
 * Этот интерфейс определяет поведение по умолчанию для ведения логов.
 * Он предоставляет метод для записи сообщений с определенным префиксом ("LoggerA").
 */
public interface LoggerA {

    /**
     * Logs a message with the "LoggerA" prefix.
     *
     * Записывает сообщение с префиксом "LoggerA".
     *
     * @param message The message to log. / Сообщение для записи в лог.
     */
    default void log(String message) {
        System.out.println("LoggerA: " + message);
    }
}
