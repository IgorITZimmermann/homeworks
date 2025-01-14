
package de.ait.homework29;

import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a user in the social media application.
 * It contains information about the user and provides methods to manage friends and posts.
 *
 * Этот класс представляет пользователя в социальной медиа-программе.
 * Он содержит информацию о пользователе и предоставляет методы для управления друзьями и публикациями.
 */
@Slf4j
public class User {

    // Unique identifier for the user
    // Уникальный идентификатор пользователя
    private String id;

    // Name of the user
    // Имя пользователя
    private String name;

    // Email address of the user
    // Адрес электронной почты пользователя
    private String email;

    // List of friends of the user
    // Список друзей пользователя
    private List<User> friends = new ArrayList<>();

    // List of posts created by the user
    // Список публикаций, созданных пользователем
    private ArrayList<Post> posts = new ArrayList<>();

    /**
     * Constructor to initialize a user with an ID, name, and email.
     * Конструктор для инициализации пользователя с ID, именем и адресом электронной почты.
     */
    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     * Adds a friend to the user's friend list.
     *
     * Добавляет друга в список друзей пользователя.
     */
    public void addFriend(User friend) {
        if(friend != null) {
            friends.add(friend);
            System.out.println("Friend added: " + friend.name);
            log.info("Friend added: " + friend.name);
        } else {
            System.out.println("Friend is not valid!");
        }
    }

    /**
     * Removes a friend from the user's friend list.
     *
     * Удаляет друга из списка друзей пользователя.
     */
    public void removeFriend(User friend) {
        if(friend != null && friends.contains(friend)) {
            friends.remove(friend);
            System.out.println("Friend removed: " + friend.name);
        } else {
            System.out.println("Friend not found!");
        }
    }

    /**
     * Retrieves the user's friends.
     *
     * Возвращает список друзей пользователя.
     */
    public ArrayList<User> getFriends() {
        return new ArrayList<>(friends);
    }

    /**
     * Creates a new post authored by the user.
     *
     * Создает новую публикацию от имени пользователя.
     */
    public Post createPost(String content) {
        if(content == null || content.isEmpty()) {
            return null;
        }
        Post post = new Post(this, content);
        System.out.println("Post was created: " + content + " by " + name);
        posts.add(post);
        return post;
    }

    /**
     * Retrieves the user's posts.
     *
     * Возвращает список публикаций пользователя.
     */
    public ArrayList<Post> getPosts() {
        return new ArrayList<>(posts);
    }

    /**
     * Displays posts made by the user's friends.
     *
     * Показывает публикации, сделанные друзьями пользователя.
     */
    public void viewFriendsPosts() {
        for(User friend : friends) {
            ArrayList<Post> friendPosts = friend.getPosts();
            for(final Post post : friendPosts){
                System.out.println("Author " + post.getAuthor().getName() +
                        " Post: " + post.getContent() +
                        " Likes " + post.getLikes());
            }
        }
    }

    /**
     * Retrieves the user's ID.
     *
     * Возвращает ID пользователя.
     */
    public String getId() {
        return id;
    }

    /**
     * Retrieves the user's name.
     *
     * Возвращает имя пользователя.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the user's email.
     *
     * Возвращает адрес электронной почты пользователя.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Prints the user's basic information.
     *
     * Печатает основную информацию о пользователе.
     */
    protected void printInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
    }
}
