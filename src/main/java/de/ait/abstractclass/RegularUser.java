package de.ait.abstractclass;

/**
 * The RegularUser class extends the User class, representing a regular user.
 * Regular users have limited privileges, such as reading news.
 *
 * Класс RegularUser расширяет класс User, представляя обычного пользователя. Обычные пользователи имеют ограниченные привилегии, такие как чтение новостей.
 */
public class RegularUser extends User {

    /**
     * Constructs a RegularUser with a specified name and ID.
     *
     * @param name the name of the regular user
     * @param id the unique ID of the regular user
     *
     * Создаёт обычного пользователя с указанными именем и ID.
     *
     * @param name имя обычного пользователя
     * @param id уникальный ID обычного пользователя
     */
    public RegularUser(String name, int id) {
        super(name, id);
    }

    /**
     * Performs an action specific to a regular user, such as reading news.
     *
     * Выполняет действие, специфичное для обычных пользователей, такое как чтение новостей.
     */
    @Override
    public void performAction() {
        System.out.println(getName() + " read news");
    }
}
