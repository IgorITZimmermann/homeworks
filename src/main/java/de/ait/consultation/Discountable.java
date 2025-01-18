package de.ait.consultation;

/**
 * Интерфейс Discountable определяет возможность применения скидки к услуге.
 * The Discountable interface defines the ability to apply a discount to a service.
 */
public interface Discountable {

    /**
     * Метод для применения скидки к общей стоимости.
     * Method to apply a discount to the total cost.
     *
     * @param totalCost Общая стоимость перед скидкой / Total cost before the discount
     * @return Стоимость со скидкой / Discounted cost
     */
    double applyDiscount(double totalCost);
}
