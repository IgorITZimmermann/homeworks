
package de.ait.interfaces;

/**
 * This is the main class to demonstrate authentication functionality using different social platforms.
 * It uses the SocialAuth interface and its implementations to authenticate users and perform actions.
 *
 * Это основной класс для демонстрации функциональности авторизации с использованием различных социальных платформ.
 * Он использует интерфейс SocialAuth и его реализации для авторизации пользователей и выполнения действий.
 */
public class MainAuth {
    public static void main(String[] args) {
        // Using Facebook for authentication
        // Используем Facebook для авторизации
        SocialAuth facebookAuth = new FacebookAuth();
        facebookAuth.authenticate("fb_token_123456789");
        System.out.println(facebookAuth.getUserProfile());

        // Checking login attempts for Facebook
        // Проверка попыток входа для Facebook
        facebookAuth.checkLoginAttempts(1);
        facebookAuth.checkLoginAttempts(3);

        System.out.println("---------Google Auth------------");

        // Switching to Google for authentication
        // Переход на Google для авторизации
        SocialAuth googleAuth = new GoogleAuth();
        googleAuth.authenticate("google_oathtoken_56789");
        System.out.println(googleAuth.getUserProfile());

        // Checking login attempts for Google
        // Проверка попыток входа для Google
        boolean checkLoginAttempts = googleAuth.checkLoginAttempts(4);
        System.out.println("Допустима ли 4-я попытка? " + checkLoginAttempts);

        // Printing the maximum allowed login attempts using a static method
        // Вывод максимального количества попыток входа с использованием статического метода
        SocialAuth.printMaxLoginAttempts();
    }
}
