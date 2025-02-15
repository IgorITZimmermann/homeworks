package de.ait.homework38;

/**
 * Класс, представляющий видео на YouTube.
 * Содержит информацию о названии видео, канале, количестве просмотров, лайков, длительности, категории и монетизации.
 *
 * Class representing a YouTube video.
 * Contains information about the video title, channel, views, likes, duration, category, and monetization status.
 */
public class Video {
    private String title;         // Название видео / Video title
    private String channel;       // Название канала / Channel name
    private int views;            // Количество просмотров / Number of views
    private int likes;            // Количество лайков / Number of likes
    private int duration;         // Длительность видео в секундах / Video duration in seconds
    private String category;      // Категория видео (например, "Музыка", "Образование", "Игры") / Video category (e.g., "Music", "Education", "Gaming")
    private boolean isMonetized;  // Монетизировано ли видео / Whether the video is monetized

    /**
     * Конструктор для создания объекта Video.
     *
     * @param title название видео
     * @param channel название канала
     * @param views количество просмотров
     * @param likes количество лайков
     * @param duration длительность видео в секундах
     * @param category категория видео
     * @param isMonetized монетизировано ли видео
     *
     * Constructor for creating a Video object.
     *
     * @param title the video title
     * @param channel the channel name
     * @param views the number of views
     * @param likes the number of likes
     * @param duration the video duration in seconds
     * @param category the video category
     * @param isMonetized whether the video is monetized
     */
    public Video(String title, String channel, int views, int likes, int duration, String category, boolean isMonetized) {
        this.title = title;
        this.channel = channel;
        this.views = views;
        this.likes = likes;
        this.duration = duration;
        this.category = category;
        this.isMonetized = isMonetized;
    }

    // Геттеры и сеттеры для всех полей / Getters and setters for all fields

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isMonetized() {
        return isMonetized;
    }

    public void setMonetized(boolean monetized) {
        isMonetized = monetized;
    }

    /**
     * Переопределение метода toString для удобного вывода информации о видео.
     *
     * @return строковое представление объекта Video
     *
     * Overriding the toString method for convenient output of video information.
     *
     * @return a string representation of the Video object
     */
    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", channel='" + channel + '\'' +
                ", views=" + views +
                ", likes=" + likes +
                ", duration=" + duration +
                ", category='" + category + '\'' +
                ", isMonetized=" + isMonetized +
                '}';
    }
}