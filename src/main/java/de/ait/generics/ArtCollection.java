package de.ait.generics;

import java.util.ArrayList;
import java.util.List;

// Класс ArtCollection представляет коллекцию художников.
// T - это обобщенный тип, который должен быть подклассом Artist.
public class ArtCollection<T extends Artist> {
    // Список для хранения художников
    private List<T> artists = new ArrayList<>();

    // Метод для добавления художника в коллекцию
    public void addArtist(T artist) {
        artists.add(artist);
    }

    // Метод для поиска художника по имени
    // Возвращает художника, если он найден, иначе возвращает null
    public Artist getArtistByName(String artistName) {
        // Перебираем всех художников в списке
        for (T artist : artists) {
            // Сравниваем имя художника с заданным именем (без учета регистра)
            if (artist.getName().equalsIgnoreCase(artistName)) {
                return artist; // Возвращаем найденного художника
            }
        }
        return null; // Если художник не найден, возвращаем null
    }
}