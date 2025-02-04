package de.ait.exceptions;

//Выбрасывается, если запрашиваемое произведение искусства отсутствует в каталоге.
public class ArtworkNotFoundException extends Exception {
    public ArtworkNotFoundException(String message) {
        super(message);
    }
}
