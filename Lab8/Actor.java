import java.util.HashSet;
import java.util.Set;

public class Actor {
    private String name;
    private Set<Movie> movies;

    public Actor(String name) {
        this.name = name;
        this.movies = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    @Override
    public String toString() {
        return name;
    }
}
