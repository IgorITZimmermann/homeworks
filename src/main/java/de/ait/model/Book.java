package de.ait.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book {

    private long id;
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(long id, String title, String author, int year, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }
}
