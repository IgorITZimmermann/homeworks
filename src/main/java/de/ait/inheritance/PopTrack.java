package de.ait.inheritance;

/**
 * Класс PopTrack представляет поп-трек с информацией о популярности.
 * Наследует базовые свойства и методы класса MusicTrack и добавляет функциональность, связанную с популярностью.
 *
 * The PopTrack class represents a pop track with popularity information.
 * It inherits basic properties and methods from the MusicTrack class and adds functionality related to popularity.
 */
public class PopTrack extends MusicTrack {

    private int popularity; // Уровень популярности трека / Popularity level of the track

    /**
     * Конструктор для создания поп-трека с заданными названием, исполнителем и уровнем популярности.
     *
     * Constructor to create a pop track with the specified title, artist, and popularity level.
     *
     * @param title Название трека / Title of the track
     * @param artist Исполнитель трека / Artist of the track
     * @param popularity Уровень популярности трека / Popularity level of the track
     */
    public PopTrack(String title, String artist, int popularity) {
        super(title, artist); // Вызов конструктора базового класса / Call the superclass constructor
        this.popularity = Math.max(0, popularity); // Уровень популярности не может быть отрицательным / Popularity level cannot be negative
    }

    /**
     * Переопределённый метод для воспроизведения трека.
     * Выводит сообщение о воспроизведении поп-трека с указанием уровня популярности.
     *
     * Overridden method to play the track.
     * Prints a message about playing the pop track with its popularity level.
     */
    @Override
    public void play() {
        System.out.println("Playing pop track \"" + getTitle() + "\" by " + getArtist() + " with popularity: " + popularity);
    }

    /**
     * Возвращает уровень популярности трека.
     *
     * Returns the popularity level of the track.
     *
     * @return Уровень популярности / Popularity level
     */
    public int getPopularity() {
        return popularity;
    }

    /**
     * Устанавливает уровень популярности трека.
     * Уровень популярности не может быть отрицательным.
     *
     * Sets the popularity level of the track.
     * Popularity level cannot be negative.
     *
     * @param popularity Новый уровень популярности / New popularity level
     */
    public void setPopularity(int popularity) {
        if (popularity >= 0) {
            this.popularity = popularity;
        } else {
            System.out.println("Popularity level cannot be negative.");
        }
    }
}