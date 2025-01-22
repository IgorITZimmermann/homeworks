package de.ait.homework31;

import lombok.extern.slf4j.Slf4j;

// Класс Advertisement представляет собой рекламное сообщение, наследуемое от MailItem.
// Class Advertisement represents an advertising message, inheriting from MailItem.
@Slf4j
public class Advertisement extends MailItem {

    private int quantity; // Количество копий рекламного сообщения.
    // Number of copies of the advertisement.

    private double pricePer50Item = 1.0; // Цена за 50 копий.
    // Price per 50 items.

    // Конструктор для создания рекламного сообщения.
    // Constructor for creating an advertisement.
    public Advertisement(String sender, String recipient, double weight, int quantity) {
        super(sender, recipient, weight);
        this.quantity = quantity;
    }

    // Расчёт стоимости доставки на основе количества.
    // Calculates shipping costs based on quantity.
    @Override
    double calculateShippingCost() {
        log.info("Advertisement, quantity " + quantity);
        return Math.ceil(quantity / 50) * pricePer50Item;
    }

    // Печать деталей рекламного сообщения.
    // Prints details of the advertisement.
    @Override
    public void printDetails() {
        System.out.println("Рекламная листовка:");
        super.printDetails();
        System.out.println("Количество копий: " + quantity);
        double cost = calculateShippingCost();
        System.out.println("Стоимость доставки: " + cost + " евро");
    }
}