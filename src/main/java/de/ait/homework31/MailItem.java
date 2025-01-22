package de.ait.homework31;

import lombok.extern.slf4j.Slf4j;

// Абстрактный класс MailItem представляет почтовый объект.
// Abstract class MailItem represents a mail item.
@Slf4j
public abstract class MailItem {

    private String sender; // Отправитель почтового объекта.
    // Sender of the mail item.
    private String recipient; // Получатель почтового объекта.
    // Recipient of the mail item.
    private double weight; // Вес почтового объекта в килограммах.
    // Weight of the mail item in kilograms.

    // Конструктор для инициализации почтового объекта.
    // Constructor for initializing the mail item.
    public MailItem(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }

    // Абстрактный метод для расчета стоимости доставки.
    // Abstract method to calculate the shipping cost.
    abstract double calculateShippingCost();

    // Метод для печати деталей почтового объекта.
    // Method for printing details of the mail item.
    public void printDetails() {
        System.out.println("Отправитель: " + sender);
        System.out.println("Получатель: " + recipient);
        System.out.println("Вес: " + weight + " кг");
    }

    public double getWeight() {
        return weight;
    }
}