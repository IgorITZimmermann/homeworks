package de.ait.exceptions;
//Выбрасывается, если предоставлены некорректные данные
// для произведения искусства (пустое название или имя художника).
public class InvalidArtworkDataException  extends IllegalArgumentException
{
    public InvalidArtworkDataException(String message)
    {
        super(message);
    }
}
