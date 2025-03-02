package de.ait.generics;

import com.github.javafaker.Faker;
import de.ait.javaio.Person;

// Основной класс приложения для демонстрации работы с классом Box
// Main application class to demonstrate the use of the Box class
public class BoxApp {
    public static void main(String[] args) {

        // Создание коробки для хранения строки
        // Creating a box to store a string
        Box<String> stringBox = new Box<>("Hello World!");
        String resultGetterBox = stringBox.getValue();
        System.out.println(resultGetterBox);
        stringBox.setValue("Goodbye World!");
        resultGetterBox = stringBox.getValue();
        System.out.println(resultGetterBox);
        System.out.println("----------------");

        // Создание коробки для хранения числа с плавающей точкой
        // Creating a box to store a floating-point number
        Box<Double> doubleBox = new Box<>(123.45);
        Double resultGetterBoxDouble = doubleBox.getValue();
        System.out.println(resultGetterBoxDouble);

        // Создание коробки для хранения объекта Person
        // Creating a box to store a Person object
        Faker faker = new Faker();
        Person person =  new Person(faker.name().lastName(),34,"111");
        Box<Person> personBox = new Box<>(person);
        Person resultGetterBoxPerson = personBox.getValue();
        System.out.println(resultGetterBoxPerson);

    }
}