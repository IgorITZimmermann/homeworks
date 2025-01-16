package de.ait.abstractclass;

/**
 * The User class serves as an abstract base class for various types of users.
 * It provides shared properties such as name and ID, and defines an abstract method for user-specific actions.
 *
 * Класс User является абстрактным базовым классом для различных типов пользователей.
 * Он предоставляет общие свойства, такие как имя и ID, и определяет абстрактный метод для специфичных действий пользователя.
 */
public abstract class User {

    private String name;
    private int id;

    /**
     * Constructs a User with a specified name and ID.
     *
     * @param name the name of the user
     * @param id the unique ID of the user
     *
     * Создаёт пользователя с указанными именем и ID.
     *
     * @param name имя пользователя
     * @param id уникальный ID пользователя
     */
    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Abstract method to be implemented by subclasses for user-specific actions.
     *
     * Абстрактный метод, который должен быть реализован в наследниках для специфичных действий пользователя.
     */
    public abstract void performAction();

    /**
     * Returns the name of the user.
     *
     * @return the name of the user
     *
     * Возвращает имя пользователя.
     *
     * @return имя пользователя
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the unique ID of the user.
     *
     * @return the unique ID of the user
     *
     * Возвращает уникальный ID пользователя.
     *
     * @return уникальный ID пользователя
     */
    public int getId() {
        return id;
    }
}
