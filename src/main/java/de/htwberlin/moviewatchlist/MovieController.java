package de.htwberlin.moviewatchlist;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://movie-watchlist-frontend-3zvi.onrender.com"
})
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