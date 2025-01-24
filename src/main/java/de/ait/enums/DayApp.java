package de.ait.enums;

// This file contains the main application logic for working with the Day enumeration.
// Этот файл содержит основную логику приложения для работы с перечислением Day.

public class DayApp {
    public static void main(String[] args) {
        // Example usage of the Day enumeration
        // Пример использования перечисления Day
        for (Day day : Day.values()) {
            System.out.println("Day: " + day);
        }
    }
}
