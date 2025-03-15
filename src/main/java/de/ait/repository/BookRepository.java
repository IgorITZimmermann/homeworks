package de.ait.repository;

import de.ait.model.Book;

import java.util.List;

public interface BookRepository {
    void save(Book book);
    Book findById(long id);
    List<Book> findAll();
}
