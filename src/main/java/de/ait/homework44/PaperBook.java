package de.ait.homework44;

public class PaperBook  extends Book{

    private int pages;

    public PaperBook(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }


    @Override
    public String getDescription() {
        return "Book with " + pages + " pages. Author: " + getAuthor() + ". Title: " + getTitle() + ".";
    }

    public int getPages() {
        return pages;
    }
}
