package de.ait.consultation;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс BeautySalon управляет услугами, предоставляемыми в салоне красоты.
 * The BeautySalon class manages the services provided in a beauty salon.
 */
public class BeautySalon {

    // Список всех услуг, предоставленных в салоне / List of all services provided in the salon
    private List<Service> services;

    /**
     * Конструктор для инициализации списка услуг.
     * Constructor to initialize the list of services.
     */
    public BeautySalon() {
        services = new ArrayList<>();
    }

    /**
     * Метод для добавления услуги в список.
     * Method to add a service to the list.
     *
     * @param service Услуга для добавления / Service to be added
     */
    public void addService(Service service) {
        services.add(service);
    }

    /**
     * Метод для печати квитанций всех услуг в списке.
     * Method to print receipts for all services in the list.
     */
    public void printAllReceipts() {
        for (Service service : services) {
            if (service instanceof Discountable) { // Проверяем, применима ли скидка / Check if a discount is applicable
                service.printReceipt();
                System.out.println("Скидка применена: " + ((Facial) service).getDiscountResultPrice());
            } else {
                service.printReceipt();
            }
        }
    }
}
