package de.ait.abstractclass;

/**
 * The SocialMedia class serves as an abstract base class for different social media platforms.
 * It provides shared functionality for posting and liking content, while requiring subclasses to implement specific posting behavior.
 *
 * Класс SocialMedia является абстрактным базовым классом для различных социальных медиа-платформ.
 * Он предоставляет общую функциональность для публикации и лайков контента, требуя от подклассов реализовывать специфичное поведение постов.
 */
public abstract class SocialMedia {

    private String userName;

    /**
     * Constructs a SocialMedia instance with a specified username.
     *
     * @param userName the name of the user
     *
     * Создаёт инстанцию SocialMedia с указанным именем пользователя.
     *
     * @param userName имя пользователя
     */
    public SocialMedia(String userName) {
        this.userName = userName;
    }

    /**
     * Returns the username associated with this social media account.
     *
     * @return the username
     *
     * Возвращает имя пользователя, связанное с этим аккаунтом в социальных медиа.
     *
     * @return имя пользователя
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Abstract method for posting content. Must be implemented by subclasses.
     *
     * @param content the content to be posted
     *
     * Абстрактный метод для публикации контента. Должен быть реализован в подклассах.
     *
     * @param content контент, который будет опубликован
     */
    public abstract void postContent(String content);

    /**
     * Allows the user to like a post. Displays a message indicating the like action.
     *
     * Позволяет пользователю лайкнуть публикацию. Отображает сообщение, указывающее на действие лайка.
     */
    public void likePost() {
        System.out.println(userName + " likes the post");
    }
}
