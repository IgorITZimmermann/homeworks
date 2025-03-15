package de.ait.service;

import de.ait.model.Book;
import de.ait.model.Loan;
import de.ait.model.Reader;
import de.ait.repository.InMemoryBookRepositoryImpl;
import de.ait.repository.InMemoryLoanRepositoryImpl;
import de.ait.repository.InMemoryReaderRepositoryImpl;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class LibraryService {

    private InMemoryBookRepositoryImpl inMemoryBookRepository;
    private InMemoryReaderRepositoryImpl inMemoryReaderRepository;
    private InMemoryLoanRepositoryImpl inMemoryLoanRepository;

    public LibraryService(InMemoryBookRepositoryImpl inMemoryBookRepository, InMemoryReaderRepositoryImpl inMemoryReaderRepository, InMemoryLoanRepositoryImpl inMemoryLoanRepository) {
        this.inMemoryBookRepository = inMemoryBookRepository;
        this.inMemoryReaderRepository = inMemoryReaderRepository;
        this.inMemoryLoanRepository = inMemoryLoanRepository;
    }

    public void addBook(Book book){
        if(book == null){
            log.error("Book is null");
        }
        else {
            if(inMemoryBookRepository.findById(book.getId()) != null){
                log.error("Book with id {} already exists", book.getId());
            }
            else {
                log.info("Adding book: {}", book);
                inMemoryBookRepository.save( book);
            }
        }

    }

    public void registerNewReader(Reader reader){
        if(reader == null){
            log.error("Reader is null");
        }
        else {
            if(inMemoryReaderRepository.findById(reader.getId()) != null){
                log.error("Reader with id {} already exists", reader.getId());
            }
            else {
                log.info("Registering new reader: {}", reader);
                inMemoryReaderRepository.save( reader);
            }
        }
    }

    public void issueBookToReader(long bookId, long readerId){
        Book book = inMemoryBookRepository.findById(bookId);
        Reader reader = inMemoryReaderRepository.findById(readerId);

        if(book == null){
            log.error("Book with id {} not found", bookId);
            return;
        }
        if(reader == null){
            log.error("Reader with id {} not found", readerId);
            return;
        }
        if(!book.isAvailable()){
            log.error("Book with id {} is not available", bookId);
            return;
        }
        if(reader.getCurrentBooks() >= reader.getMaxBooksAllowed()){
            log.error("Reader with id {} has reached the maximum number of books allowed", readerId);
            return;
        }

        book.setAvailable(false);
        reader.setCurrentBooks(reader.getCurrentBooks() + 1);

        LocalDate dateIssue = LocalDate.now();
        LocalDate dateDue = dateIssue.minusDays(14);

        Loan loan = new Loan(bookId, readerId,dateIssue, dateDue, null);
        inMemoryLoanRepository.save(loan);

        log.info("Book {} issued to reader {}", bookId, readerId);



    }

}
