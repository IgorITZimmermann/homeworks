package de.ait.abstractclass;

/**
 * The Facebook class extends the SocialMedia abstract class, representing a Facebook account.
 * It provides functionality to post content on the Facebook platform.
 *
 * Класс Facebook расширяет абстрактный класс SocialMedia, представляя аккаунт на Facebook. Он обеспечивает функцию публикации контента на платформе Facebook.
 */
public class Facebook extends SocialMedia {

    /**
     * Constructs a Facebook instance with a specified username.
     *
     * @param userName the name of the user
     *
     * Создаёт инстанцию Facebook с указанным именем пользователя.
     *
     * @param userName имя пользователя
     */
    public Facebook(String userName) {
        super(userName);
    }

    /**
     * Posts content on Facebook.
     *
     * @param content the content to be posted
     *
     * Публикует контент на Facebook.
     *
     * @param content контент, который будет опубликован
     */
    @Override
    public void postContent(String content) {
        System.out.println(getUserName() + " posted: " + content + " on Facebook");
    }
}
