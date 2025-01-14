
package de.ait.homework29;

/**
 * This class represents an admin user, which is a specific type of user.
 * Admin users have additional privileges, such as the ability to ban other users.
 *
 * Этот класс представляет администратора, который является особым типом пользователя.
 * Администраторы обладают дополнительными правами, например, возможностью блокировать других пользователей.
 */
public class AdminUser extends User {

    /**
     * Constructor to initialize an admin user with an ID, name, and email.
     *
     * Конструктор для инициализации администратора с ID, именем и адресом электронной почты.
     */
    public AdminUser(String id, String name, String email) {
        super(id, name, email);
    }

    /**
     * Bans a user by displaying a message.
     *
     * Блокирует пользователя, отображая сообщение.
     */
    public void banUser() {
        System.out.println("User is banned!");
    }

    /**
     * Overrides the method to print additional information for admin users.
     *
     * Переопределяет метод для вывода дополнительной информации о администраторах.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Admin User");
    }
}
