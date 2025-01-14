
package de.ait.homework29;

/**
 * This class represents a premium user, a specific type of user with a subscription.
 * Premium users have additional attributes, such as the subscription end date.
 *
 * Этот класс представляет премиум-пользователя, который имеет подписку.
 * Премиум-пользователи обладают дополнительными атрибутами, такими как дата окончания подписки.
 */
public class PremiumUser extends User {

    // The year when the user's subscription ends
    // Год, в котором истекает подписка пользователя
    private int subscriptionEndDate;

    /**
     * Constructor to initialize a premium user with an ID, name, email, and subscription end date.
     *
     * Конструктор для инициализации премиум-пользователя с ID, именем, адресом электронной почты и датой окончания подписки.
     */
    public PremiumUser(String id, String name, String email, int subscriptionEndDate) {
        super(id, name, email);
        this.subscriptionEndDate = subscriptionEndDate;
    }

    /**
     * Checks if the user's subscription is expired based on the current year.
     *
     * Проверяет, истекла ли подписка пользователя, исходя из текущего года.
     */
    public boolean isSubscriptionExpired() {
        return subscriptionEndDate < 2026;
    }

    /**
     * Overrides the method to print additional information for premium users,
     * including their subscription end date.
     *
     * Переопределяет метод для вывода дополнительной информации о премиум-пользователях,
     * включая дату окончания подписки.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Subscription End Date: " + subscriptionEndDate);
    }
}
