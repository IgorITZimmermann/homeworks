package de.ait.propertyapp;

import java.util.HashMap;
import java.util.Map;

/* Класс, представляющий коммерческую недвижимость. */
/* Class representing a commercial property. */
public class CommercialProperty implements Property {

    private String address;
    private double area;
    private String businessType;

    private String officeType = "office";

    private String warehouseType = "warehouse";

    public CommercialProperty(String address, double area, String businessType) {
        this.address = address;
        this.area = area;
        this.businessType = businessType;
    }

    @Override
// Метод для расчета цены недвижимости.
// Method for calculating the price of the property.
    public double calculatePrice() {
        Map<String, Double> priceProperty = new HashMap<>();
        priceProperty.put(officeType, 1500.0);
        priceProperty.put(warehouseType, 800.0);

        double pricePerSquareMeter = priceProperty.getOrDefault(businessType, 1000.0);

        return area * pricePerSquareMeter;

        /*
        double totalPrice = 0;
        switch (businessType) {
            case "office" -> {
                totalPrice = area * 1500;
            }
            case "warehouse" -> {
                totalPrice = area * 800;
            }
            default -> {
                totalPrice = area * 1000;
            }
        }
        return totalPrice;
         */

    }

    @Override
// Метод для вывода деталей недвижимости.
// Method for printing property details.
    public void printDetails() {
        switch (businessType) {
            case "office" -> {
                System.out.println("Офис: ");
            }
            case "warehouse" -> {
                System.out.println("Склад: ");
            }
            default -> {
                System.out.println("Другая недвижимость: ");
            }
        }
        System.out.println("Address: " + address);
        System.out.println("Area: " + area + " square meters");
        System.out.println(calculatePrice());
        System.out.println();
    }

    @Override
    public String getAddress() {
        return address;
    }
}
