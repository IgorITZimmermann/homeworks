
package de.ait.interfaces;

/**
 * This class implements the SocialAuth interface to provide authentication functionality using Google.
 * It includes methods for authenticating, retrieving user profiles, and accessing the OAuth token.
 *
 * Этот класс реализует интерфейс SocialAuth для предоставления функциональности авторизации через Google.
 * Он включает методы для авторизации, получения профилей пользователей и доступа к токену OAuth.
 */
public class GoogleAuth implements SocialAuth {

    // OAuth token used for authentication
    // OAuth токен, используемый для авторизации
    private String oAuthToken;

    /**
     * Authenticates a user using their credentials (e.g., OAuth token).
     *
     * Авторизует пользователя, используя его учетные данные (например, токен OAuth).
     *
     * @param userCredentials The credentials used for authentication. / Учетные данные для авторизации.
     */
    @Override
    public void authenticate(String userCredentials) {
        this.oAuthToken = userCredentials;
        System.out.println("Авторизация через Google с токеном: " + oAuthToken);
    }

    /**
     * Retrieves the user profile based on the authentication token.
     *
     * Возвращает профиль пользователя на основе токена авторизации.
     *
     * @return A string representation of the user profile. / Строковое представление профиля пользователя.
     */
    @Override
    public String getUserProfile() {
        return "Google-профиль пользователя: " + oAuthToken;
    }

    /**
     * Retrieves the OAuth token used for authentication.
     *
     * Возвращает OAuth токен, используемый для авторизации.
     *
     * @return The OAuth token. / OAuth токен.
     */
    public String getOAuthToken() {
        return oAuthToken;
    }
}
