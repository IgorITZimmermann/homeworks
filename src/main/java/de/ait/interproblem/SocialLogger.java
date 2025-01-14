
package de.ait.interproblem;

/**
 * This class implements both LoggerA and LoggerB interfaces.
 * It overrides the default logging behavior to combine logging functionality from both interfaces.
 *
 * Этот класс реализует интерфейсы LoggerA и LoggerB.
 * Он переопределяет поведение по умолчанию для объединения функциональности ведения логов из обоих интерфейсов.
 */
public class SocialLogger implements LoggerA, LoggerB {

    /**
     * Overrides the log method to combine logging from LoggerA and LoggerB.
     * It adds an additional log entry specific to SocialLogger.
     *
     * Переопределяет метод log для объединения логирования из LoggerA и LoggerB.
     * Добавляет дополнительную запись в лог, специфичную для SocialLogger.
     *
     * @param message The message to log. / Сообщение для записи в лог.
     */
    @Override
    public void log(String message) {
        LoggerA.super.log(message); // Calls the log method from LoggerA
        System.out.println("SocialLogger: " + message); // Adds a log entry for SocialLogger
        LoggerB.super.log(message); // Calls the log method from LoggerB
    }

    /**
     * Main method to demonstrate the logging functionality.
     *
     * Основной метод для демонстрации функциональности ведения логов.
     */
    public static void main(String[] args) {
        SocialLogger socialLogger = new SocialLogger();
        socialLogger.log("TestLog");
    }
}
