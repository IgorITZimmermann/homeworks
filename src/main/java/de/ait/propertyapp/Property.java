package de.ait.propertyapp;

/* Интерфейс для всех типов недвижимости. */
/* Interface for all property types. */
public interface Property {

    double calculatePrice(); // метод для расчета цены недвижимости

    void printDetails();// метод для вывода информации о недвижимости

    String getAddress();

}
