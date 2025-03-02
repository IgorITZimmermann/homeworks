package de.ait.generics;

// Класс SimplePair, использующий обобщения для хранения пары значений
// SimplePair class using generics to store a pair of values
public class SimplePair<K, V> {

    private K first; // Первое значение пары / First value of the pair
    private V second; // Второе значение пары / Second value of the pair

    // Конструктор для инициализации пары значений
    // Constructor to initialize the pair of values
    public SimplePair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    // Геттер для получения первого значения
    // Getter to retrieve the first value
    public K getFirst() {
        return first;
    }

    // Геттер для получения второго значения
    // Getter to retrieve the second value
    public V getSecond() {
        return second;
    }
}