package de.ait.homework33;

/**
 * This class represents a Gift with a name, category, and status.
 * It provides methods to retrieve and update its properties.
 *
 * Этот класс представляет подарок с именем, категорией и статусом.
 * Предоставляет методы для получения и изменения его свойств.
 */
public class Gift {
    private String name; // The name of the gift / Название подарка
    private GiftCategory category; // The category of the gift / Категория подарка
    private GiftStatus status; // The status of the gift / Статус подарка

    /**
     * Constructor to initialize a gift with a name, category, and status.
     * Конструктор для инициализации подарка с именем, категорией и статусом.
     */
    public Gift(String name, GiftCategory category, GiftStatus status) {
        this.name = name;
        this.category = category;
        this.status = status;
    }

    /**
     * Returns a string representation of the gift.
     * Возвращает строковое представление подарка.
     */
    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", status=" + status +
                '}';
    }

    /**
     * Gets the name of the gift.
     * Возвращает название подарка.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the category of the gift.
     * Возвращает категорию подарка.
     */
    public GiftCategory getCategory() {
        return category;
    }

    /**
     * Gets the status of the gift.
     * Возвращает статус подарка.
     */
    public GiftStatus getStatus() {
        return status;
    }

    /**
     * Updates the status of the gift.
     * Обновляет статус подарка.
     */
    public void setStatus(GiftStatus status) {
        this.status = status;
    }
}
