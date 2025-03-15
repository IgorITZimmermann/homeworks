package de.ait.repository;

import de.ait.model.Book;
import de.ait.model.Reader;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
public class InMemoryReaderRepositoryImpl implements ReaderRepository {
    private List<Reader> readers = new ArrayList<>();

    @Override
    public void save(Reader reader) {
        Reader existingReader = findById(reader.getId());
        if( existingReader == null){
            log.info("Saving reader {}", reader.getName());
            readers.add(reader);
        }
        else {
            log.warn("Reader {} already exists", reader.getName());
        }

    }

    @Override
    public Reader findById(long id) {
        Optional<Reader> result = readers.stream()
                .filter(reader -> reader.getId() == id)
                .findFirst();
        log.info("Reader found {}", result.isPresent());
        return result.orElse(null);
    }

    @Override
    public List<Reader> findAll() {
        return new ArrayList<>(readers);
    }
}
