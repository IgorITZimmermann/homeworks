package de.ait.abstractclass;

/**
 * The Instagram class extends the SocialMedia abstract class, representing an Instagram account.
 * It provides functionality to post content on the Instagram platform.
 *
 * Класс Instagram расширяет абстрактный класс SocialMedia, представляя аккаунт на Instagram. Он обеспечивает функцию публикации контента на платформе Instagram.
 */
public class Instagram extends SocialMedia {

    /**
     * Constructs an Instagram instance with a specified username.
     *
     * @param userName the name of the user
     *
     * Создаёт инстанцию Instagram с указанным именем пользователя.
     *
     * @param userName имя пользователя
     */
    public Instagram(String userName) {
        super(userName);
    }

    /**
     * Posts content on Instagram.
     *
     * @param content the content to be posted
     *
     * Публикует контент на Instagram.
     *
     * @param content контент, который будет опубликован
     */
    @Override
    public void postContent(String content) {
        System.out.println(getUserName() + " posted: " + content + " on Instagram");
    }
}
