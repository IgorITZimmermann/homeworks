package de.ait.propertyapp;

/* Класс, представляющий дом. */
/* Class representing a house. */
public class House implements Property {

    private String address;
    private double area;
    private double landArea;
    private boolean hasGarage;

    public House(String address, double area, double landArea, boolean hasGarage) {
        this.address = address;
        this.area = area;
        this.landArea = landArea;
        this.hasGarage = hasGarage;
    }

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public double getLandArea() {
        return landArea;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    @Override
// Метод для расчета цены недвижимости.
// Method for calculating the price of the property.
    public double calculatePrice() {
        double basePriceHouse = 800;  // Цена за 1 квадратнай дома
        double basePriceLand = 200;   // Цена за 1 квадратный участка
        double totalPrice = (basePriceHouse * area) + (basePriceLand * landArea);
        if (hasGarage) {
            totalPrice += 5000;  // Если есть гараж, добавляем фиксированную стоимость
        }
        return totalPrice;
    }

    @Override
// Метод для вывода деталей недвижимости.
// Method for printing property details.
    public void printDetails() {
        System.out.println("Дом:");
        System.out.println("Адрес: " + address);
        System.out.println("Площадь дома: " + area + " метр квадратный");
        System.out.println("Площадь участка: " + landArea + " метр квадратный");
        System.out.println("Наличие гаража: " + (hasGarage ? "Да" : "Нет"));
        System.out.println("Цена: " + calculatePrice() + " евро");
        System.out.println();
    }


}
