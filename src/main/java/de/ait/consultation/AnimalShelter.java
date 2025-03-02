package de.ait.consultation;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

// Класс приюта для животных, использующий обобщения (generics) для работы с разными типами животных
// Animal shelter class using generics to work with different types of animals
@Slf4j
public class AnimalShelter <T extends Animal> {

    private List<T> animals = new ArrayList<>(); // Список животных в приюте / List of animals in the shelter

    // Метод для добавления животного в приют
    // Method to admit an animal to the shelter
    public void admitAnimal(T animal){
        animals.add(animal);
        log.info("Animal {} added to shelter", animal.getName());
    }

    // Метод для освобождения животного из приюта по имени
    // Method to release an animal from the shelter by name
    public T releaseAnimal(String name){
        for(T animal : animals){
            if(animal.getName().equals(name)){
                animals.remove(animal);
                log.info("Animal {} removed from shelter", animal.getName());
                return animal;
            }
        }

        return null;
    }

    // Метод для получения списка всех животных в приюте
    // Method to get the list of all animals in the shelter
    public List<T> getAnimals(){
        return new ArrayList<>(animals);
    }
}