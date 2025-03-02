package de.ait.consultation;

// Класс DogAnimal, представляющий собак, наследующий класс Animal
// DogAnimal class representing dogs, inheriting from the Animal class
public class DogAnimal extends Animal {

    // Конструктор для инициализации имени и возраста собаки
    // Constructor to initialize the name and age of the dog
    public DogAnimal(String name, int age) {
        super(name, age);
    }

    // Переопределение метода makeSound для издания звука, характерного для собак
    // Overriding the makeSound method to make a sound specific to dogs
    @Override
    public void makeSound() {
        System.out.println("Woof. My name is" + getName() + " age is " + getAge());
    }
}