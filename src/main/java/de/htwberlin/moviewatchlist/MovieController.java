package de.htwberlin.moviewatchlist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @GetMapping("/movies")
    public List<Movie> getMovies() {

        return List.of(
                new Movie(1L, "Interstellar", "Science-Fiction", 2014, 5, true),
                new Movie(2L, "Inception", "Science-Fiction", 2010, 4, true),
                new Movie(3L, "Avatar", "Fantasy", 2009, null, false)
        );
    }
}