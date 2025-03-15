package de.ait.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Reader {
    private long id;
    private String name;
    private int maxBooksAllowed;
    private int currentBooks;
    private String contactInformation;

    public Reader(long id, String name, int maxBooksAllowed, int currentBooks, String contactInformation) {
        this.id = id;
        this.name = name;
        this.maxBooksAllowed = maxBooksAllowed;
        this.currentBooks = currentBooks;
        this.contactInformation = contactInformation;
    }
}
