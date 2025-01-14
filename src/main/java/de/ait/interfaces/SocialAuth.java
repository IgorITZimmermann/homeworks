
package de.ait.interfaces;

/**
 * This interface defines the contract for social media authentication.
 * It provides methods for authenticating, retrieving user profiles, and managing login attempts.
 *
 * Этот интерфейс определяет контракт для авторизации в социальных сетях.
 * Он предоставляет методы для авторизации, получения профилей пользователей и управления попытками входа.
 */
public interface SocialAuth {

    // Constant for the maximum number of login attempts
    // Константа для максимального количества попыток входа
    int MAX_LOGIN_ATTEMPTS = 3;

    /**
     * Authenticates a user using their credentials.
     *
     * Авторизует пользователя, используя его учетные данные.
     *
     * @param userCredentials The credentials used for authentication. / Учетные данные для авторизации.
     */
    void authenticate(String userCredentials);

    /**
     * Retrieves the user profile after successful authentication.
     *
     * Возвращает профиль пользователя после успешной авторизации.
     *
     * @return A string representation of the user profile. / Строковое представление профиля пользователя.
     */
    String getUserProfile();

    /**
     * Checks if the current login attempt is within the allowable limit.
     *
     * Проверяет, находится ли текущая попытка входа в пределах допустимого лимита.
     *
     * @param currentAttempts The number of login attempts made. / Количество совершенных попыток входа.
     * @return True if the attempt is allowed; false otherwise. / True, если попытка допустима, иначе false.
     */
    default boolean checkLoginAttempts(int currentAttempts) {
        return currentAttempts < MAX_LOGIN_ATTEMPTS;
    }

    /**
     * Prints the maximum allowed login attempts.
     *
     * Выводит максимальное количество допустимых попыток входа.
     */
    static void printMaxLoginAttempts() {
        System.out.println("Максимально количество попыток входа: " + MAX_LOGIN_ATTEMPTS);
    }
}
