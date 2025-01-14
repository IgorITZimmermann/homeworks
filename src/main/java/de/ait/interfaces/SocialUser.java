
package de.ait.interfaces;

/**
 * This class implements both SocialAuth and SocialSharing interfaces,
 * allowing it to authenticate users and share content on social media.
 *
 * Этот класс реализует интерфейсы SocialAuth и SocialSharing,
 * что позволяет ему авторизовывать пользователей и делиться контентом в социальных сетях.
 */
public class SocialUser implements SocialAuth, SocialSharing {

    // Token used for authentication and sharing
    // Токен, используемый для авторизации и публикации
    private String token;

    /**
     * Authenticates a user using their credentials.
     *
     * Авторизует пользователя, используя его учетные данные.
     *
     * @param userCredentials The credentials used for authentication. / Учетные данные для авторизации.
     */
    @Override
    public void authenticate(String userCredentials) {
        this.token = userCredentials;
        System.out.println("Универсальная авторизация с общим токеном: " + token);
    }

    /**
     * Retrieves the user profile after successful authentication.
     *
     * Возвращает профиль пользователя после успешной авторизации.
     *
     * @return A string representation of the user profile. / Строковое представление профиля пользователя.
     */
    @Override
    public String getUserProfile() {
        return "Универсальный профиль (токен: " + token + ")";
    }

    /**
     * Posts a message to the social media platform using the authentication token.
     *
     * Публикует сообщение на платформе социальной сети, используя токен авторизации.
     *
     * @param message The message to post. / Сообщение для публикации.
     */
    @Override
    public void postMessage(String message) {
        System.out.println("Постим сообщение " + message + " с помощью токена " + token);
    }
}
