package de.ait.homework31;

import lombok.extern.slf4j.Slf4j;

// Класс Package представляет посылку, которая является расширением класса MailItem.
// Class Package represents a package, which is an extension of the MailItem class.
@Slf4j
public class Package extends MailItem {

    private int width;  // Ширина посылки в сантиметрах.
    // Width of the package in centimeters.
    private int height; // Высота посылки в сантиметрах.
    // Height of the package in centimeters.
    private int length; // Длина посылки в сантиметрах.
    // Length of the package in centimeters.
    private double preisKilogramm = 2.0;


    // Конструктор для создания посылки.
    // Constructor for creating a package.
    public Package(String sender, String recipient, double weight, int width, int height, int length) {
        super(sender, recipient, weight);
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // Расчёт стоимости доставки в зависимости от размеров и хрупкости.
    // Calculates the shipping cost based on size and fragility.
    @Override
    public double calculateShippingCost() {
        int weightPackage = (int) getWeight();
        if (getWeight() <= 0) {
            log.warn("Attempt to calculate shipping cost for empty package ");
            return 0;
        } else if (0 < getWeight() && getWeight() < 1) {
            log.info("Attempt to calculate shipping cost for little package ");
            return preisKilogramm;
        } else if ((getWeight() - weightPackage) != 0) {
            return (weightPackage * preisKilogramm) + preisKilogramm;
        } else {
            return weightPackage * preisKilogramm;
        }
    }

    // Печать деталей посылки.
    // Prints details of the package.
    @Override
    public void printDetails() {
        System.out.println("Посылка");
        super.printDetails();
        System.out.println("Размеры: " + width + "x" + height + "x" + length);
        double cost = calculateShippingCost();
        System.out.println("Стоимость доставки: " + cost + " евро");
        System.out.println("---------------------------");
    }
}