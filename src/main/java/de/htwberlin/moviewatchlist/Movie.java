package de.htwberlin.moviewatchlist;

public class Movie {
    private Long id;
    private String title;
    private String genre;
    private int releaseYear;
    private Integer rating;
    private boolean watched;


    public Movie(Long id, String title, String genre,
                 int releaseYear, Integer rating, boolean watched) {

        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.watched = watched;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Integer getRating() {
        return rating;
    }

    public boolean isWatched() {
        return watched;
    }
}

