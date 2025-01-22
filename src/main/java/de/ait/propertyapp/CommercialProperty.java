package de.ait.propertyapp;

import java.util.HashMap;
import java.util.Map;

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
    }

}
