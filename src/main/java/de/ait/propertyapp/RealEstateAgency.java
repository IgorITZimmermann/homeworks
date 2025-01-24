package de.ait.propertyapp;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;


@Slf4j
/* Класс для управления агентством недвижимости. */
/* Class for managing a real estate agency. */
public class RealEstateAgency {

    @Getter
    private double totalPrice;


    private List<Property> properties = new ArrayList<>();

    // Метод для добавления объекта недвижимости в список.
// Method for adding a property to the list.
    public void addProperty(Property property){
        if(checkProperty(property)){
            properties.add(property);
            log.info("Property added:" + property.getAddress());
        }
        else {
            System.out.println("Property is invalid");
            log.warn("Property is invalid: ");
        }
    }

    // Метод для расчета общей стоимости всех объектов.
// Method for calculating the total price of all properties.
    public void calculateTotalPrice(){
        if(properties.isEmpty()){
            System.out.println("No properties found");
        }
        else {
            totalPrice = 0;
            for (Property property : properties) {
                totalPrice = totalPrice + property.calculatePrice();
            }
            System.out.println("Properties total price is: " + totalPrice + " euros");
        }
    }

    // Метод для вывода всех деталей недвижимости.
// Method for printing all property details.
    public void printAllDetails(){
        if(properties.isEmpty()){
            System.out.println("No properties found");
        }
        else {
            for (Property property : properties) {
                property.printDetails();
            }
        }
    }

    private boolean checkProperty(Property property){
        if(property == null){
            return false;
        }
        else if(property.calculatePrice() <= 0){
            return false;
        }
        else if(property.getAddress() == null || property.getAddress().isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }


    public List<Property> getProperties() {
        return new ArrayList<>(properties);
    }


}
