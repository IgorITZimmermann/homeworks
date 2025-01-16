package de.ait.homework30;

import java.util.List;

/**
 * This interface represents a contract for objects that can manage comments.
 * Objects implementing this interface are capable of adding and retrieving comments.
 *
 * Этот интерфейс задаёт контракт для объектов, способных управлять комментариями.
 * Объекты, реализующие данный интерфейс, могут добавлять и получать комментарии.
 */
public interface Commentable {

    /**
     * Adds a comment to the object.
     *
     * @param comment the text of the comment to be added
     *
     * Добавляет комментарий к объекту.
     *
     * @param comment текст комментария, который будет добавлен
     */
    void addComment(String comment);

    /**
     * Retrieves the list of all comments.
     *
     * @return a list of comments
     *
     * Возвращает список всех комментариев.
     *
     * @return список комментариев
     */
    List<String> getComments();

}
