package de.ait.consultation;

public enum PetType {

    DOG("Собака"),
    CAT("Кошка"),
    HAMSTER("Хомяк"),
    PARROT("Попугай"),
    FISH("Рыбка");

    private final  String description;

    PetType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
