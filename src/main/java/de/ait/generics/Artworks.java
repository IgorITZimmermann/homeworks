package de.ait.generics;

public class Artworks {
    private System title;
    private String artist;
    private ArtStyle style;

    public Artworks(System title, String artist, ArtStyle style) {
        this.title = title;
        this.artist = artist;
        this.style = style;
    }

    public System getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public ArtStyle getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Artworks{" +
                "title=" + title +
                ", artist='" + artist + '\'' +
                ", style=" + style +
                '}';
    }
}
