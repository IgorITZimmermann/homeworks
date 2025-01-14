
package de.ait.homework29;

/**
 * This is the main class to manage and demonstrate the functionality of the social media application.
 * It creates instances of users and posts, and demonstrates their interactions.
 *
 * Это основной класс для управления и демонстрации функциональности социальной медиа-программы.
 * Он создает экземпляры пользователей и публикаций и демонстрирует их взаимодействие.
 */
public class SocialMediaManager {
    public static void main(String[] args) {
        // Creating a premium user with a subscription
        // Создание премиум-пользователя с подпиской
        PremiumUser premiumUser = new PremiumUser("1", "Alex", "alex_hero@gmail.com", 2026);
        premiumUser.createPost("Cool games 2025 !!!");

        // Creating a post and adding likes
        // Создание публикации и добавление лайков
        Post premiumUserPost = premiumUser.createPost("Cool PSs 2025 !!!");
        for (int i = 0; i < 10; i++) {
            premiumUserPost.like();
        }
        premiumUser.printInfo();

        // Creating an admin user
        // Создание администратора
        AdminUser adminUser = new AdminUser("2", "Admin", "admin_cool@gmail.com");
        Post createdPost = adminUser.createPost("Cool PCs 2025 !!!");
        for (int i = 0; i < 5; i++) {
            createdPost.like();
        }
        adminUser.printInfo();

        // Adding and managing friends
        // Добавление и управление друзьями
        adminUser.addFriend(premiumUser);
        System.out.println("---------------------------");
        adminUser.viewFriendsPosts();

        System.out.println("---------------------------");
        adminUser.removeFriend(premiumUser);
        adminUser.viewFriendsPosts();

        // Demonstrating polymorphism with users
        // Демонстрация полиморфизма с пользователями
        System.out.println("-------------Полиморфизм--------------");
        User userMaria = new PremiumUser("4DD", " Maria", " maria@example.com ", 2025);
        Post mariaPost = userMaria.createPost("Cool PCs 2025 !!!");
        mariaPost.like();
        mariaPost.like();
        mariaPost.like();
        userMaria.printInfo();

        User userMax = new AdminUser("4DH", " Max", " max@example.com ");
        userMax.addFriend(userMaria);
        userMax.viewFriendsPosts();
        userMax.printInfo();
    }
}
