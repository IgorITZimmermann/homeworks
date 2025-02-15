package de.ait.homework38;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Класс для анализа данных о видео на YouTube.
 * Содержит методы для фильтрации, сортировки и анализа списка видео.
 *
 * Class for analyzing YouTube video data.
 * Contains methods for filtering, sorting, and analyzing a list of videos.
 */
public class YouTubeAnalyzer {

    // Список видео для анализа / List of videos for analysis
    private static List<Video> videos = List.of(
            new Video("Как научиться программировать", "IT Channel", 1500000, 12000, 720, "Образование", true),
            new Video("Лучшие моменты матча", "Sports Channel", 500000, 8000, 600, "Спорт", false),
            new Video("Новый трек 2025", "Music Channel", 3000000, 25000, 240, "Музыка", true),
            new Video("Обзор новой игры", "Gaming Channel", 2000000, 15000, 900, "Игры", true),
            new Video("Как приготовить пиццу", "Cooking Channel", 800000, 10000, 1200, "Кулинария", false),
            new Video("Как приготовить кофе", "Cooking Channel", 100_000, 70000, 1400, "Кулинария", true)
    );

    public static void main(String[] args) {
        // Примеры использования методов / Examples of using methods
        //System.out.println(getVideosWithMoreThan1MViews());
        //System.out.println(getTitlesOfLongVideos());
        //System.out.println(getUniqueCategories());
        //System.out.println(getTitlesUpperCase());
        //System.out.println(getVideoLikes());
        //System.out.println(getMostLikedVideos());
        //System.out.println(getMostDurationVideos());
        //System.out.println(getAllVideosCount());
        //System.out.println(getMostLikedVideo());
        //System.out.println(getLessDurationVideo());
        //System.out.println(isVideo1M());
        System.out.println(allMusicVideosIsMonetized());
    }

    /**
     * Метод для получения списка видео с более чем 1 миллионом просмотров.
     *
     * @return список видео с более чем 1 миллионом просмотров
     *
     * Method to get a list of videos with more than 1 million views.
     *
     * @return a list of videos with more than 1 million views
     */
    public static List<Video> getVideosWithMoreThan1MViews() {
        List<Video> videosWithMoreThan1MViews = videos.stream()
                .filter(video -> video.getViews() > 1_000_000)
                .collect(Collectors.toList());
        return videosWithMoreThan1MViews;
    }

    /**
     * Метод для получения списка названий видео, длительность которых больше 600 секунд.
     *
     * @return список названий длинных видео
     *
     * Method to get a list of titles of videos with a duration longer than 600 seconds.
     *
     * @return a list of titles of long videos
     */
    public static List<String> getTitlesOfLongVideos() {
        List<String> titlesOfLongVideos = videos.stream()
                .filter(video -> video.getDuration() > 600)
                .map(Video::getTitle)
                .collect(Collectors.toList());
        return titlesOfLongVideos;
    }

    /**
     * Метод для получения списка уникальных категорий видео.
     *
     * @return список уникальных категорий
     *
     * Method to get a list of unique video categories.
     *
     * @return a list of unique categories
     */
    public static List<String> getUniqueCategories(){
        List<String> uniqueCategories = videos.stream()
                .map(Video::getCategory)
                .distinct()
                .collect(Collectors.toList());
        return uniqueCategories;
    }

    /**
     * Метод для получения списка названий видео в верхнем регистре.
     *
     * @return список названий видео в верхнем регистре
     *
     * Method to get a list of video titles in uppercase.
     *
     * @return a list of video titles in uppercase
     */
    public static List<String> getTitlesUpperCase(){
        List<String> titlesUpperCase = videos.stream()
                .map(Video::getTitle)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        return titlesUpperCase;
    }

    /**
     * Метод для получения списка пар (название видео, количество лайков).
     *
     * @return список пар (название видео, количество лайков)
     *
     * Method to get a list of pairs (video title, number of likes).
     *
     * @return a list of pairs (video title, number of likes)
     */
    public static List<Map.Entry<String, Integer>> getVideoLikes(){
        List<Map.Entry<String, Integer>> videosLikes = videos.stream()
                .map(video -> Map.entry(video.getTitle(), video.getLikes()))
                .collect(Collectors.toList());
        return videosLikes;
    }

    /**
     * Метод для получения списка самых популярных видео (по количеству просмотров).
     *
     * @return список самых популярных видео
     *
     * Method to get a list of the most popular videos (by number of views).
     *
     * @return a list of the most popular videos
     */
    public static List<Video> getMostLikedVideos(){
        List<Video> mostLikedVideos = videos.stream()
                .sorted(Comparator.comparingInt(Video::getViews).reversed())
                .limit(5)
                .collect(Collectors.toList());
        return mostLikedVideos;
    }

    /**
     * Метод для получения списка самых длинных видео.
     *
     * @return список самых длинных видео
     *
     * Method to get a list of the longest videos.
     *
     * @return a list of the longest videos
     */
    public static List<Video> getMostDurationVideos(){
        List<Video> mostDurationVideos = videos.stream()
                .sorted(Comparator.comparingInt(Video::getDuration))
                .limit(3)
                .collect(Collectors.toList());
        return mostDurationVideos;
    }

    /**
     * Метод для получения общего количества видео.
     *
     * @return общее количество видео
     *
     * Method to get the total number of videos.
     *
     * @return the total number of videos
     */
    public static long getAllVideosCount(){
        long allVideosCount = videos.stream()
                .count();
        return allVideosCount;
    }

    /**
     * Метод для получения видео с наибольшим количеством лайков.
     *
     * @return Optional, содержащий видео с наибольшим количеством лайков
     *
     * Method to get the video with the most likes.
     *
     * @return an Optional containing the video with the most likes
     */
    public static Optional<Video> getMostLikedVideo(){
        Optional<Video> mostLikedVideo = videos.stream()
                .max(Comparator.comparingInt(Video::getLikes));
        return mostLikedVideo;
    }

    /**
     * Метод для получения видео с наименьшей длительностью.
     *
     * @return Optional, содержащий видео с наименьшей длительностью
     *
     * Method to get the video with the shortest duration.
     *
     * @return an Optional containing the video with the shortest duration
     */
    public static Optional<Video> getLessDurationVideo(){
        Optional<Video> lessDurationVideo = videos.stream()
                .min(Comparator.comparingInt(Video::getDuration));
        return lessDurationVideo;
    }

    /**
     * Метод для проверки, есть ли видео с более чем 10 миллионами просмотров.
     *
     * @return true, если такое видео есть, иначе false
     *
     * Method to check if there is a video with more than 10 million views.
     *
     * @return true if such a video exists, otherwise false
     */
    public static boolean isVideo1M(){
        boolean result = videos.stream()
                .anyMatch(video -> video.getViews() > 10_000_000);
        return result;
    }

    /**
     * Метод для проверки, монетизированы ли все видео в категории "Музыка".
     *
     * @return true, если все музыкальные видео монетизированы, иначе false
     *
     * Method to check if all videos in the "Music" category are monetized.
     *
     * @return true if all music videos are monetized, otherwise false
     */
    public static boolean allMusicVideosIsMonetized(){
        boolean result = videos.stream()
                .filter(video -> video.getCategory().equals("Музыка"))
                .allMatch(video -> video.isMonetized());
        return result;
    }
}