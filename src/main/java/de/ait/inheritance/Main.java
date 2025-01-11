package de.ait.inheritance;

public class Main {
    public static void main(String[] args) {

        // Работа с экземпляром класса Book (бумажная книга)
        // Working with an instance of the Book class (paper book)
        Book papierBook = new Book("The Hobbit", "Hobbit Author");
        papierBook.printInfo(); // Вывод информации о книге / Print book information
        papierBook.read(); // Чтение книги в бумажном формате / Read the book in paper format

        System.out.println("---------------------------");

        // Работа с экземпляром класса EBook (электронная книга)
        // Working with an instance of the EBook class (electronic book)
        EBook eBook = new EBook("1984", "Orwell", 4);
        eBook.printInfo(); // Вывод информации о книге / Print book information
        eBook.read(); // Чтение книги в электронном формате / Read the book in electronic format
        eBook.download(); // Загрузка электронной книги / Download the ebook

        System.out.println("---------------------------");

        // Работа с экземпляром класса AudioBook (аудиокнига)
        // Working with an instance of the AudioBook class (audiobook)
        AudioBook audioBook = new AudioBook("Maori", "King", 360);
        audioBook.printInfo(); // Вывод информации о книге / Print book information
        audioBook.read(); // Чтение книги в аудиоформате / Read the book in audio format
        audioBook.listen(); // Прослушивание аудиокниги / Listen to the audiobook

        System.out.println("------------ПОЛИМОРФИЗМ---------------");

        // Демонстрация полиморфизма
        // Demonstrating polymorphism
        Book anyBook = new AudioBook("anyTitle", "anyAuthor", 10);
        anyBook.read(); // Вызов метода read из AudioBook / Call the read method from AudioBook
        anyBook.printInfo(); // Вызов метода printInfo из Book / Call the printInfo method from Book
        // Методы listen и download недоступны, так как они не определены в классе Book.
        // Methods like listen and download are unavailable because they are not defined in the Book class.
    }
}