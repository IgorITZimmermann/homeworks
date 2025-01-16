package de.ait.homework30;

/**
 * The SocialManager class demonstrates the usage of the Post class by creating posts,
 * adding likes and comments, and displaying detailed post information.
 *
 * Класс SocialManager демонстрирует использование класса Post, создавая публикации, добавляя лайки и комментарии, а также отображая подробную информацию о публикациях.
 */
public class SocialManager {

    public static void main(String[] args) {
        // Creating a post about a car
        // Создание публикации об автомобиле
        Post postCar = new Post();
        postCar.like();
        postCar.like();
        postCar.like();
        postCar.addComment("I like this car");
        postCar.addComment("I like this car too");
        postCar.addComment("I like this car too too");
        postCar.getInfoAbautPost();

        System.out.println("---------------------------");

        // Creating a post about music
        // Создание публикации о музыке
        Post postMusic = new Post();
        postMusic.like();
        postMusic.addComment(null);
        postMusic.getInfoAbautPost();
    }
}
