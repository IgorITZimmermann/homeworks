package de.ait.abstractclass;

/**
 * The AdminUser class extends the User class, representing an administrator user.
 * Admin users have additional privileges, such as checking news.
 *
 * Класс AdminUser расширяет класс User, представляя администратора. Администраторы имеют дополнительные привилегии, такие как проверка новостей.
 */
public class AdminUser extends User {

    /**
     * Constructs an AdminUser with a specified name and ID.
     *
     * @param name the name of the administrator
     * @param id the unique ID of the administrator
     *
     * Создаёт администратора с указанными именем и ID.
     *
     * @param name имя администратора
     * @param id уникальный ID администратора
     */
    public AdminUser(String name, int id) {
        super(name, id);
    }

    /**
     * Performs an action specific to an administrator user, such as checking news.
     *
     * Выполняет действие, специфичное для администраторов, такое как проверка новостей.
     */
    @Override
    public void performAction() {
        System.out.println(getName() + " checked news");
    }
}
