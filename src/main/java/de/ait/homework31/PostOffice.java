package de.ait.homework31;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

// Класс PostOffice управляет операциями почтового отделения.
// Class PostOffice manages the operations of a post office.
@Slf4j
public class PostOffice {
    private List<MailItem> mailItems; // Список почтовых отправлений.
    // List of mail items.

    // Конструктор почтового отделения, инициализирующий пустой список отправлений.
    // Constructor for the post office, initializing an empty list of mail items.
    public PostOffice() {
        mailItems = new ArrayList<>();
    }

    // Метод для добавления почтового отправления в список.
    // Method to add a mail item to the list.
    public void addMailItem(MailItem item) {
        if (item == null) {
            log.warn("Параметр Null");
            System.out.println(" Параметр Null"); // Logging and printing a warning if the item is null.
        } else {
            mailItems.add(item);
            log.info("MailItem was added"); // Logging the addition of an item.
        }
    }

    // Метод для расчёта общей стоимости доставки всех почтовых отправлений.
    // Method to calculate the total shipping cost for all mail items.
    public void calculateTotalShippingCost() {
        System.out.println("------------------------------");
        if (mailItems.isEmpty()) {
            log.warn("Список пуст");
            System.out.println("Список пуст"); // Logging and printing if the list is empty.
        } else {
            double totalShippingCost = 0;
            for (MailItem mailItem : mailItems) {
                totalShippingCost += mailItem.calculateShippingCost(); // Summing up the total shipping cost.
            }
            System.out.println("Общая стоимость доставки: " + totalShippingCost + " евро");
        }
    }

    // Метод для вывода деталей всех почтовых отправлений.
    // Method to print details of all mail items.
    public void printAllDetails() {
        System.out.println("------------------------------");
        if (mailItems.isEmpty()) {
            log.warn("Список пуст");
            System.out.println("Список пуст"); // Logging and printing if the list is empty.
        } else {
            for (MailItem mailItem : mailItems) {
                mailItem.printDetails(); // Printing details of each mail item.
            }
        }
    }
}