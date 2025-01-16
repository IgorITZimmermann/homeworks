package de.ait.homework30;

/**
 * This interface defines a contract for objects that can be "liked".
 * Objects implementing this interface are capable of receiving likes and tracking the count of likes.
 *
 * Этот интерфейс определяет контракт для объектов, которые можно "лайкать".
 * Объекты, реализующие данный интерфейс, способны получать лайки и отслеживать их количество.
 */
public interface Likable {

    /**
     * Increases the like count by one.
     *
     * Увеличивает счётчик лайков на один.
     */
    void like();

    /**
     * Retrieves the current count of likes.
     *
     * @return the number of likes
     *
     * Возвращает текущее количество лайков.
     *
     * @return количество лайков
     */
    int getLikesCount();
}
