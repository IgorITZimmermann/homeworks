package de.ait.consultation;

/**
 * Абстрактный класс Service предоставляет базовую структуру для различных услуг.
 * Abstract class Service provides the basic structure for different services.
 */
public abstract class Service {
    // Имя клиента / Customer name
    protected String customerName;

    // Название услуги / Service name
    protected String serviceName;

    // Базовая стоимость услуги / Base price of the service
    protected double basePrice;

    /**
     * Конструктор для инициализации полей класса Service.
     * Constructor to initialize the fields of the Service class.
     *
     * @param customerName Имя клиента / Name of the customer
     * @param serviceName Название услуги / Name of the service
     * @param basePrice Базовая стоимость услуги / Base price of the service
     */
    public Service(String customerName, String serviceName, double basePrice) {
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.basePrice = basePrice;
    }

    /**
     * Абстрактный метод для расчета общей стоимости услуги.
     * Abstract method to calculate the total cost of the service.
     *
     * @return Общая стоимость услуги / Total cost of the service
     */
    public abstract double calculateTotalCost();

    /**
     * Метод для вывода квитанции с деталями услуги.
     * Method to print the receipt with service details.
     */
    public void printReceipt() {
        System.out.println("Квитанция:"); // "Receipt:"
        System.out.println("Клиент: " + customerName); // "Customer: " + customerName
        System.out.println("Услуга: " + serviceName); // "Service: " + serviceName
        System.out.println("Общая стоимость: " + calculateTotalCost()); // "Total cost: " + total cost
        System.out.println();
    }
}
