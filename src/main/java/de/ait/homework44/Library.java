package de.ait.homework44;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Slf4j
public class Library <T extends Book>{

    private List<T> books = new ArrayList<>();

    public void addBook(T book){
        if(book != null){
            books.add(book);
        }
        else {
            log.error("Book is null");
        }
    }

    public boolean removeBook(String title){
        if(title != null && !title.isEmpty()){
            Iterator<T> iterator = books.iterator();
            while (iterator.hasNext()){
                T currentBook = iterator.next();
                if(currentBook.getTitle().equals(title)){
                    iterator.remove();
                    log.info("Book {} removed", title);
                    return true;
                }
            }
        }
        log.error("Book {} not found", title);
        return false;
    }

    public T findBook(String title){
        for(T book : books){
            if(book.getTitle().equals(title)){
                log.info("Book {} found", title);
                return book;
            }
        }
        log.error("Book {} not found", title);
        return null;
    }

    public void listBooks(){
        for(T book : books){
            log.info("Book: {}", book.getDescription());
        }
    }

}
