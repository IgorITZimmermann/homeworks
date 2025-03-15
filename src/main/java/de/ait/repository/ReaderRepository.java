package de.ait.repository;

import de.ait.model.Reader;

import java.util.List;

public interface ReaderRepository {
    void save(Reader reader);
    Reader findById(long id);
    List<Reader> findAll();
}
