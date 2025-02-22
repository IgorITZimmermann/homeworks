package de.ait.consultation;

public class DogApp {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(dog.getName().toUpperCase());
        System.out.println(dog.getAge());
    }
}
