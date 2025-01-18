package de.ait.consultation;

/**
 * Класс Haircut представляет услугу стрижки.
 * The Haircut class represents a haircut service.
 */
public class Haircut extends Service {

    // Поле, указывающее, включает ли стрижка укладку / Indicates if styling is included in the haircut
    private boolean includesStyling;

    /**
     * Конструктор для создания услуги стрижки.
     * Constructor to create a haircut service.
     *
     * @param customerName Имя клиента / Name of the customer
     * @param serviceName Название услуги / Name of the service
     * @param basePrice Базовая стоимость стрижки / Base price of the haircut
     * @param includesStyling Указывает, включает ли услуга укладку / Specifies if the service includes styling
     */
    public Haircut(String customerName, String serviceName, double basePrice, boolean includesStyling) {
        super(customerName, serviceName, basePrice);
        this.includesStyling = includesStyling;
    }

    /**
     * Метод для расчета общей стоимости стрижки.
     * Method to calculate the total cost of the haircut.
     *
     * @return Общая стоимость стрижки / Total cost of the haircut
     */
    @Override
    public double calculateTotalCost() {
        double totalCost = basePrice; // Начинаем с базовой стоимости / Start with the base price
        if (includesStyling) { // Если укладка включена, добавляем 10 / If styling is included, add 10
            totalCost += 10;
        }
        return totalCost;
    }
}
