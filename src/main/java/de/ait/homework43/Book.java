package de.ait.homework43;

public class Book  extends Product {

    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "Book: " + getName() + " author: " + author + " price: " + getPrice();
    }

    public String getAuthor() {
        return author;
    }

}
