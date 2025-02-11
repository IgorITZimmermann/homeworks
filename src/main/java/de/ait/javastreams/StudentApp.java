package de.ait.javastreams;

import com.github.javafaker.Faker; // Импорт библиотеки Faker для генерации случайных данных
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentApp {
    public static void main(String[] args) {
        // Создаем объект Faker для генерации случайных данных
        // Create a Faker object to generate random data
        Faker faker = new Faker();

        // Создаем список студентов с использованием Faker для генерации имен и случайных данных
        // Create a list of students using Faker to generate names and random data
        List<Student> students = List.of(
                new Student(faker.name().lastName(), 19, "IT", 3.8),
                new Student(faker.name().lastName(), 20, "Bio", 3.0),
                new Student(faker.name().lastName(), 21, "Math", 3.5),
                new Student(faker.name().lastName(), 22, "Physics", 3.2),
                new Student(faker.name().lastName(), 23, "Chemistry", 1.7),
                new Student(faker.name().lastName(), 24, "Geography", 2.4)
        );

        /*
        1. Отфильтровать всех студентов, чей средний балл (gpa) больше либо равен 3.0.
        2. Собрать их в список и вывести на экран.
         */
        // Используем Stream API для фильтрации студентов с GPA >= 3.0
        // Use Stream API to filter students with GPA >= 3.0
        List<Student> result = students.stream()
                .filter(s -> s.getGpa() >= 3.0) // Фильтруем студентов по GPA
                .collect(Collectors.toList()); // Собираем результаты в список
        System.out.println("Students with GPA >= 3.0: " + result);

        /*
        1. Найти самого старшего студента в списке (по age).
        2. Результат вывести в консоль.
         */
        // Используем Stream API для поиска самого старшего студента
        // Use Stream API to find the oldest student
        Optional<Student> oldStudent = students.stream()
                .max(Comparator.comparingInt(Student::getAge)); // Находим студента с максимальным возрастом
        System.out.println("Oldest student: " + oldStudent.get()); // Выводим результат

        /*
        1. Проверить, есть ли хотя бы один студент, у которого средний балл (gpa) меньше 3.0.
        2. Вывести в консоль true/false по результату.
         */
        // Используем Stream API для проверки наличия студентов с GPA < 3.0
        // Use Stream API to check if there is any student with GPA < 3.0
        boolean resultLowGpa = students.stream()
                .anyMatch(s -> s.getGpa() < 3.0); // Проверяем, есть ли хотя бы один студент с GPA < 3.0
        System.out.println("Is there any student with GPA < 3.0? " + resultLowGpa); // Выводим результат
    }
}