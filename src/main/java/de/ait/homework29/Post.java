
package de.ait.homework29;

/**
 * This class represents a post in the social media application.
 * A post has an author, content, and a number of likes.
 *
 * Этот класс представляет публикацию в социальной медиа-программе.
 * Публикация имеет автора, содержание и количество лайков.
 */
public class Post {

    // The author of the post
    // Автор публикации
    private User author;

    // The content of the post
    // Содержание публикации
    private String content;

    // The number of likes the post has received
    // Количество лайков, которые получила публикация
    private int likes;

    /**
     * Constructor to create a post with an author and content.
     * Initially, the post has zero likes.
     *
     * Конструктор для создания публикации с автором и содержанием.
     * Изначально у публикации ноль лайков.
     */
    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.likes = 0;
    }

    /**
     * Increments the number of likes for the post.
     *
     * Увеличивает количество лайков у публикации.
     */
    public void like() {
        likes++;
    }

    /**
     * Retrieves the number of likes for the post.
     *
     * Возвращает количество лайков у публикации.
     */
    public int getLikes() {
        return likes;
    }

    /**
     * Retrieves the author of the post.
     *
     * Возвращает автора публикации.
     */
    public User getAuthor() {
        return author;
    }

    /**
     * Retrieves the content of the post.
     *
     * Возвращает содержание публикации.
     */
    public String getContent() {
        return content;
    }

    /**
     * Returns a string representation of the post, including the author, content, and likes.
     *
     * Возвращает строковое представление публикации, включая автора, содержание и количество лайков.
     */
    @Override
    public String toString() {
        return "Post{" +
                "author=" + author +
                ", content='" + content  + ", likes=" + likes + '}';
    }
}
