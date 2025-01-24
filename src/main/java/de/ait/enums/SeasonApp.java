package de.ait.enums;

// This file contains the main application logic for working with the Season enumeration.
// Этот файл содержит основную логику приложения для работы с перечислением Season.

public class SeasonApp {
    public static void main(String[] args) {
        // Example usage of the Season enumeration
        // Пример использования перечисления Season
        for (Season season : Season.values()) {
            System.out.println("Season: " + season);
        }
    }
}
