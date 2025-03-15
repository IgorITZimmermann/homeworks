package de.ait.repository;

import de.ait.model.Book;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
public class InMemoryBookRepositoryImpl implements BookRepository {
    private List<Book> books = new ArrayList<>();
    @Override
    public void save(Book book) {
        Book existingBook = findById(book.getId());
        if( existingBook == null){
            log.info("Saving book {}", book.getTitle());
            books.add(book);
        }
        else {
            log.warn("Book {} already exists", book.getTitle());
            System.out.println("Book already exists");
        }

    }

    @Override
    public Book findById(long id) {
       Optional<Book> result = books.stream()
                .filter(book -> book.getId() == id)
                .findFirst();
       log.info("Book found {}", result.isPresent());
       return result.orElse(null);

    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books);
    }
}
