package de.ait.consultation;

/**
 * Класс Manicure представляет услугу маникюра.
 * The Manicure class represents a manicure service.
 */
public class Manicure extends Service {

    // Поле, указывающее, включает ли маникюр гель-лак / Indicates if gel polish is included in the manicure
    private boolean includesGelPolish;

    /**
     * Конструктор для создания услуги маникюра.
     * Constructor to create a manicure service.
     *
     * @param customerName Имя клиента / Name of the customer
     * @param serviceName Название услуги / Name of the service
     * @param basePrice Базовая стоимость маникюра / Base price of the manicure
     * @param includesGelPolish Указывает, включает ли маникюр гель-лак / Specifies if the manicure includes gel polish
     */
    public Manicure(String customerName, String serviceName, double basePrice, boolean includesGelPolish) {
        super(customerName, serviceName, basePrice);
        this.includesGelPolish = includesGelPolish;
    }

    /**
     * Метод для расчета общей стоимости маникюра.
     * Method to calculate the total cost of the manicure.
     *
     * @return Общая стоимость маникюра / Total cost of the manicure
     */
    @Override
    public double calculateTotalCost() {
        double totalCost = basePrice; // Начинаем с базовой стоимости / Start with the base price
        if (includesGelPolish) { // Если гель-лак включен, добавляем 15 / If gel polish is included, add 15
            totalCost += 15;
        }
        return totalCost;
    }
}
