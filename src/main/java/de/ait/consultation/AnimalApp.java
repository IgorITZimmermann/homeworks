package de.ait.consultation;

import com.github.javafaker.Dog;

import java.util.List;

// Основной класс приложения для работы с животными
// Main application class for working with animals
public class AnimalApp {
    public static void main(String[] args) {
        // Создание приюта для собак и добавление нескольких собак
        // Creating a shelter for dogs and adding several dogs
        AnimalShelter<DogAnimal> dogAnimalShelter = new AnimalShelter<>();
        dogAnimalShelter.admitAnimal(new DogAnimal("Fido", 10));
        dogAnimalShelter.admitAnimal(new DogAnimal("Bella", 12));
        dogAnimalShelter.admitAnimal(new DogAnimal("Max", 15));
        dogAnimalShelter.admitAnimal(new DogAnimal("Buddy", 18));
        dogAnimalShelter.admitAnimal(new DogAnimal("Jack", 20));

        // Создание приюта для кошек и добавление нескольких кошек
        // Creating a shelter for cats and adding several cats
        AnimalShelter<CatAnimal> catAnimalShelter = new AnimalShelter<>();
        catAnimalShelter.admitAnimal(new CatAnimal("Garfield", 10));
        catAnimalShelter.admitAnimal(new CatAnimal("Oreo", 12));
        catAnimalShelter.admitAnimal(new CatAnimal("Luna", 15));
        catAnimalShelter.admitAnimal(new CatAnimal("Tiger", 18));
        catAnimalShelter.admitAnimal(new CatAnimal("Kitty", 20));

        // Освобождение собаки по имени Jack и вывод её имени
        // Releasing a dog named Jack and printing its name
        DogAnimal resultJack = dogAnimalShelter.releaseAnimal("Jack");
        System.out.println(resultJack.getName());

        // Вывод списка всех собак в приюте
        // Printing the list of all dogs in the shelter
        System.out.println(dogAnimalShelter.getAnimals());

        System.out.println("---------------------");

        // Получение списка всех кошек и вывод звуков, которые они издают
        // Getting the list of all cats and printing the sounds they make
        List<CatAnimal> catAnimals = catAnimalShelter.getAnimals();
        for(CatAnimal catAnimal : catAnimals){
            catAnimal.makeSound();
        }
    }
}