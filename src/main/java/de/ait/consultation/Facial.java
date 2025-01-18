package de.ait.consultation;

/**
 * Класс Facial представляет услугу ухода за лицом.
 * The Facial class represents a facial care service.
 */
public class Facial extends Service implements Discountable {

    // Длительность процедуры в минутах / Duration of the procedure in minutes
    private int duration;

    // Итоговая скидка, примененная к услуге / Final discount applied to the service
    private double discountResultPrice;

    /**
     * Конструктор для создания услуги ухода за лицом.
     * Constructor to create a facial care service.
     *
     * @param customerName Имя клиента / Name of the customer
     * @param serviceName Название услуги / Name of the service
     * @param basePrice Базовая стоимость услуги / Base price of the service
     * @param duration Длительность процедуры в минутах / Duration of the procedure in minutes
     * @param discountResultPrice Итоговая скидка (по умолчанию 0) / Final discount (default is 0)
     */
    public Facial(String customerName, String serviceName, double basePrice, int duration, double discountResultPrice) {
        super(customerName, serviceName, basePrice);
        this.duration = duration;
        this.discountResultPrice = 0; // Устанавливаем скидку по умолчанию / Set discount to default
    }

    /**
     * Метод для расчета общей стоимости ухода за лицом.
     * Method to calculate the total cost of the facial care.
     *
     * @return Общая стоимость с учетом скидки (если применимо) / Total cost with discount applied (if applicable)
     */
    @Override
    public double calculateTotalCost() {
        double totalCost = basePrice + duration; // Общая стоимость: базовая + длительность / Total cost: base price + duration
        if (duration > 60) { // Если длительность > 60 минут, применяем скидку / If duration > 60 minutes, apply discount
            totalCost = applyDiscount(totalCost);
            this.discountResultPrice = (basePrice + duration) - totalCost; // Рассчитываем величину скидки / Calculate the discount amount
        }
        return totalCost;
    }

    /**
     * Метод применения скидки.
     * Method to apply a discount.
     *
     * @param totalCost Общая стоимость перед скидкой / Total cost before discount
     * @return Стоимость со скидкой / Discounted cost
     */
    @Override
    public double applyDiscount(double totalCost) {
        return totalCost * 0.9; // Применяем 10% скидку / Apply a 10% discount
    }

    /**
     * Метод для получения величины скидки.
     * Method to get the discount amount.
     *
     * @return Величина скидки / Discount amount
     */
    public double getDiscountResultPrice() {
        return discountResultPrice;
    }
}
