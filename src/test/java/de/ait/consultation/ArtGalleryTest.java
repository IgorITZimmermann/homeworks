package de.ait.consultation;

import com.github.javafaker.Faker;
import de.ait.exceptions.ArtworkNotFoundException;
import de.ait.exceptions.InvalidArtworkDataException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArtGalleryTest {
    private ArtGallery artGallery = null;
    Faker faker = null;

    @BeforeEach
    public void setUp() {
       artGallery = new ArtGallery();
        faker = new Faker();
    }

    @Test
    void testAddArtworkFailTitleIsNull() {
        assertThrows(InvalidArtworkDataException.class, ()-> artGallery.addArtwork(null, faker.artist().name()));
    }

    @Test
    void testAddArtworkSuccess() {
        assertDoesNotThrow(()-> artGallery.addArtwork(faker.artist().name(), faker.artist().name()));
        Map<String,String> result = artGallery.getArtworks();
        assertEquals(1, result.size());
    }

    @Test
    void testFindArtworkFailTitleIsNull() {
        assertThrows(InvalidArtworkDataException.class, ()-> artGallery.findArtwork(null));
    }

    @Test
    void testFindArtworkFailTitleWasNotFound() {
        assertThrows(ArtworkNotFoundException.class, ()-> artGallery.findArtwork(faker.artist().name()));
    }

    @Test
    void testFindArtworkSuccess() throws ArtworkNotFoundException
    {
        String title = faker.artist().name();
        String artist = faker.artist().name();

        assertDoesNotThrow(()->artGallery.addArtwork(title, artist));

        String result = artGallery.findArtwork(title);

        assertEquals(artist, result);


    }

}
