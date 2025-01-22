package de.ait.homework31;

import lombok.extern.slf4j.Slf4j;

// Класс Letter представляет письмо, которое также является наследником класса MailItem.
// Class Letter represents a letter, which is also a subclass of MailItem.
@Slf4j
public class Letter extends MailItem {

    private boolean isRegistered; // Признак зарегистрированного письма.
    // Indicates if the letter is registered.

    // Конструктор для создания письма.
    // Constructor for creating a letter.
    public Letter(String sender, String recipient, double weight, boolean isRegistered) {
        super(sender, recipient, weight);
        this.isRegistered = isRegistered;
    }

    // Расчёт стоимости доставки в зависимости от регистрации письма.
    // Calculates the shipping cost depending on whether the letter is registered.
    @Override
    public double calculateShippingCost() {
        if(isRegistered){
            log.info("Letter is registered. Cost 10 euro");
            return 10;
        }
        log.info("Letter not registered. Cost 5 euro");
        return 5;
    }

    // Печать деталей письма.
    // Prints details of the letter.
    @Override
    public void printDetails(){
        System.out.println("Письмо");
        super.printDetails();
        System.out.println(isRegistered ? "Зарегистрированное: Да" : "Зарегистрированное: Нет");
        double shippingCost = calculateShippingCost();
        System.out.println("Стоимость доставки: " + shippingCost + " евро");
        System.out.println("---------------------------");
    }
}