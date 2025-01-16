package de.ait.homework30;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * The Post class represents a social media post that can be liked and commented on.
 * It implements the Commentable and Likable interfaces to provide functionality for managing likes and comments.
 *
 * Класс Post представляет сообщение в социальной сети, которое можно лайкать и комментировать.
 * Он реализует интерфейсы Commentable и Likable для предоставления функциональности по управлению лайками и комментариями.
 */
@Slf4j
public class Post implements Commentable, Likable {

    private int likesCount;
    private List<String> comments;

    /**
     * Constructs a new Post with no likes and an empty list of comments.
     *
     * Создаёт новый Post с нулевым количеством лайков и пустым списком комментариев.
     */
    public Post() {
        this.likesCount = 0;
        comments = new ArrayList<>();
    }

    /**
     * Adds a comment to the post.
     *
     * @param comment the text of the comment to add
     *
     * Добавляет комментарий к сообщению.
     *
     * @param comment текст комментария для добавления
     */
    @Override
    public void addComment(String comment) {
        if (comment == null || comment.isEmpty()) {
            System.out.println("Comment is empty or null");
            log.warn("Comment is empty or null");
        } else {
            comments.add(comment);
            System.out.println("Comment added: " + comment);
            log.info("Comment added: {}", comment);
        }
    }

    /**
     * Returns the list of comments on the post.
     *
     * @return a list of comments
     *
     * Возвращает список комментариев к сообщению.
     *
     * @return список комментариев
     */
    @Override
    public List<String> getComments() {
        return new ArrayList<>(comments);
    }

    /**
     * Increases the number of likes by one.
     *
     * Увеличивает количество лайков на один.
     */
    @Override
    public void like() {
        likesCount++;
    }

    /**
     * Returns the current number of likes.
     *
     * @return the number of likes
     *
     * Возвращает текущее количество лайков.
     *
     * @return количество лайков
     */
    @Override
    public int getLikesCount() {
        return likesCount;
    }

    /**
     * Displays detailed information about the post, including likes and comments.
     *
     * Отображает подробную информацию о сообщении, включая лайки и комментарии.
     */
    public void getInfoAbautPost() {
        System.out.println("---------Post info--------------");
        log.info("Post info");
        System.out.println("Likes count: " + likesCount);
        log.info("Likes count: {}", likesCount);
        System.out.println("Comments: " + comments);
        log.info("Comments: {}", comments);
    }
}
