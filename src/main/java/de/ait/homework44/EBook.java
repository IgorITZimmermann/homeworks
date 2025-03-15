package de.ait.homework44;

public class EBook  extends Book{

    private double fileSizeMb;

    public EBook(String title, String author, double fileSizeMb) {
        super(title, author);
        this.fileSizeMb = fileSizeMb;
    }

    @Override
    public String getDescription() {
        return "E-Book. Author: " + getAuthor() + ". Title: " + getTitle() + ". File size: " + fileSizeMb + " MB.";
    }

    public double getFileSizeMb() {
        return fileSizeMb;
    }
}
