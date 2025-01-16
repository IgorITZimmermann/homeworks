package de.ait.abstractclass;

/**
 * The SocialMediaManager class demonstrates the usage of various social media platforms.
 * It creates instances of specific social media platforms, posts content, and performs actions like liking posts.
 *
 * Класс SocialMediaManager демонстрирует использование различных социальных медиа-платформ.
 * Он создаёт экземпляры конкретных социальных сетей, публикует контент и выполняет действия, такие как лайки.
 */
public class SocialMediaManager {

    public static void main(String[] args) {
        // Create a Facebook instance and perform actions
        // Создание экземпляра Facebook и выполнение действий
        SocialMedia facebook = new Facebook("facebookUser");
        facebook.postContent("I love my new job");
        facebook.likePost();

        System.out.println("---------------------------");

        // Create an Instagram instance and perform actions
        // Создание экземпляра Instagram и выполнение действий
        SocialMedia instagram = new Instagram("instagramUser");
        instagram.postContent("I love my new cat");
        instagram.likePost();
    }
}
