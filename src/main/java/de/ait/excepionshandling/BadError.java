package de.ait.excepionshandling;

public class BadError {

    // Статическая переменная для отслеживания количества вызовов
    // Static variable to track the number of calls
    private static int i = 0;

    public static void main(String[] args) {
        // Запуск метода, который вызывает сам себя бесконечно
        // Starts the method that recursively calls itself indefinitely
        badMethod();
    }

    // Метод с бесконечной рекурсией, приводящей к StackOverflowError
    // Method with infinite recursion leading to StackOverflowError
    public static void badMethod() {
        // Вывод текущего значения переменной `i`
        // Print the current value of variable `i`
        System.out.println(i++);

        // Сообщение перед каждым рекурсивным вызовом
        // Message before each recursive call
        System.out.println("Неееет !!!!"); // "Noooo !!!!"

        // Рекурсивный вызов самого себя без условия выхода
        // Recursive call to itself without a base case
        badMethod();
    }
}