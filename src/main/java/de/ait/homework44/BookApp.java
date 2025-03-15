package de.ait.homework44;

import com.github.javafaker.Faker;

public class BookApp {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Library<PaperBook> library = new Library();

        Library<EBook> ebookLibrary = new Library();

        PaperBook paperBook = new PaperBook(faker.book().title(), faker.book().author(), faker.number().numberBetween(100, 500));
        PaperBook paperBook2 = new PaperBook(faker.book().title(), faker.book().author(), faker.number().numberBetween(100, 500));
        PaperBook paperBook3 = new PaperBook(faker.book().title(), faker.book().author(), faker.number().numberBetween(100, 500));
        PaperBook paperBook4 = new PaperBook(faker.book().title(), faker.book().author(), faker.number().numberBetween(100, 500));
        PaperBook paperBook5 = new PaperBook(faker.book().title(), faker.book().author(), faker.number().numberBetween(100, 500));

        EBook ebook = new EBook(faker.book().title(), faker.book().author(), faker.number().numberBetween(100, 500));
        EBook ebook2 = new EBook(faker.book().title(), faker.book().author(), faker.number().numberBetween(100, 500));

        library.addBook(paperBook);
        library.addBook(paperBook2);
        library.addBook(paperBook3);
        library.addBook(paperBook4);
        library.addBook(paperBook5);

        ebookLibrary.addBook(ebook);
        ebookLibrary.addBook(ebook2);

        library.listBooks();
        PaperBook resultPapiertBook = library.findBook(paperBook.getTitle());
        System.out.println("Book found" + resultPapiertBook.getDescription());

        boolean resultDelete = library.removeBook(paperBook.getTitle());
        System.out.println("Book deleted: " + resultDelete);

        System.out.println("---------");
        ebookLibrary.listBooks();
        EBook resultEbook = ebookLibrary.findBook(ebook.getTitle());
        System.out.println("Book found" + resultEbook.getDescription());







    }
}
