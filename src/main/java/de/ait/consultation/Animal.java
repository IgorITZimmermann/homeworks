package de.ait.consultation;

// Абстрактный класс Animal, представляющий общие характеристики и поведение животных
// Abstract class Animal representing common characteristics and behavior of animals
public abstract class Animal {

    private String name; // Имя животного / Name of the animal
    private int age; // Возраст животного / Age of the animal

    // Конструктор для инициализации имени и возраста животного
    // Constructor to initialize the name and age of the animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Абстрактный метод для издания звука, который должен быть реализован в подклассах
    // Abstract method for making a sound, to be implemented by subclasses
    public abstract void makeSound();

    // Геттер для получения имени животного
    // Getter for the animal's name
    public String getName() {
        return name;
    }

    // Сеттер для установки имени животного
    // Setter for the animal's name
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для получения возраста животного
    // Getter for the animal's age
    public int getAge() {
        return age;
    }

    // Сеттер для установки возраста животного
    // Setter for the animal's age
    public void setAge(int age) {
        this.age = age;
    }

    // Переопределение метода toString для представления объекта в виде строки
    // Overriding the toString method to represent the object as a string
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}