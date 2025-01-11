package de.ait.inheritance;

/**
 * Класс AudioBook представляет аудиокнигу.
 * Наследуется от класса Book и добавляет специфические свойства и методы для аудиокниг.
 *
 * The AudioBook class represents an audiobook.
 * It extends the Book class and adds specific properties and methods for audiobooks.
 */
public class AudioBook extends Book {

    private double durationMinutes; // Длительность аудиокниги в минутах / Duration of the audiobook in minutes

    /**
     * Конструктор для создания аудиокниги с заданным названием, автором и длительностью.
     *
     * Constructor to create an audiobook with the specified title, author, and duration.
     *
     * @param title Название книги / Title of the book
     * @param author Автор книги / Author of the book
     * @param durationMinutes Длительность аудиокниги в минутах / Duration of the audiobook in minutes
     */
    public AudioBook(String title, String author, double durationMinutes) {
        super(title, author); // Вызов конструктора базового класса / Call the superclass constructor
        this.durationMinutes = durationMinutes;
    }

    /**
     * Переопределённый метод read из базового класса.
     * Выводит сообщение, что книга читается в аудиоформате.
     *
     * Overridden read method from the base class.
     * Prints a message indicating the book is being read in audio format.
     */
    @Override
    public void read() {
        System.out.println("Reading " + getTitle() + " by " + getAuthor() + " in audio format");
    }

    /**
     * Метод для прослушивания аудиокниги.
     * Выводит сообщение с названием книги и её длительностью.
     *
     * Method to listen to the audiobook.
     * Prints a message with the book's title and duration.
     */
    public void listen() {
        System.out.println("Listening to " + getTitle() + ", duration: " + durationMinutes + " minutes");
    }

    /**
     * Возвращает длительность аудиокниги.
     *
     * Returns the duration of the audiobook.
     *
     * @return Длительность аудиокниги / Duration of the audiobook
     */
    public double getDurationMinutes() {
        return durationMinutes;
    }

    /**
     * Устанавливает длительность аудиокниги.
     *
     * Sets the duration of the audiobook.
     *
     * @param durationMinutes Новая длительность аудиокниги / New duration of the audiobook
     */
    public void setDurationMinutes(double durationMinutes) {
        if (durationMinutes > 0) {
            this.durationMinutes = durationMinutes;
        } else {
            System.out.println("Duration must be positive.");
        }
    }
}