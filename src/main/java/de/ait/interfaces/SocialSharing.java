
package de.ait.interfaces;

/**
 * This interface defines the contract for sharing content on social media.
 * It provides a method for posting messages.
 *
 * Этот интерфейс определяет контракт для публикации контента в социальных сетях.
 * Он предоставляет метод для размещения сообщений.
 */
public interface SocialSharing {

    /**
     * Posts a message to the social media platform.
     *
     * Публикует сообщение на платформе социальной сети.
     *
     * @param message The message to post. / Сообщение для публикации.
     */
    void postMessage(String message);
}
