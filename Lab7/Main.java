import java.util.*;

class Database {
    private List<Movie> movies;
    private List<Actor> actors;

    public Database() {
        this.movies = new ArrayList<>();
        this.actors = new ArrayList<>();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public boolean hasActorNotInAnyMovie() {
        for (Actor actor : actors) {
            if (actor.getMovies().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public List<Actor> getCoActors(Actor targetActor) {
        Set<Actor> coActors = new HashSet<>();

        for (Movie movie : targetActor.getMovies()) {
            Iterator<Actor> actorIterator = movie.getActors().iterator();
            while (actorIterator.hasNext()) {
                Actor actor = actorIterator.next();
                if (!actor.equals(targetActor)) {
                    coActors.add(actor);
                }
            }
        }

        return new ArrayList<>(coActors);
    }

    public Movie findMovieWithMostActors() {
        Iterator<Movie> iterator = movies.iterator();
        Movie movieWithMostActors = iterator.next();

        while (iterator.hasNext()) {
            Movie currentMovie = iterator.next();
            if (currentMovie.getActors().size() > movieWithMostActors.getActors().size()) {
                movieWithMostActors = currentMovie;
            }
        }

        return movieWithMostActors;
    }
}

class Movie {
    private String title;
    private List<Actor> actors;

    public Movie(String title) {
        this.title = title;
        this.actors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }
}

class Actor {
    private String name;
    private List<Movie> movies;

    public Actor(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Movie> getMovies() {
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

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        Actor actor1 = new Actor("Actor1");
        Actor actor2 = new Actor("Actor2");
        Actor actor3 = new Actor("Actor3");

        Movie movie1 = new Movie("Movie1");
        Movie movie2 = new Movie("Movie2");

        movie1.addActor(actor1);
        movie1.addActor(actor2);
        movie1.addActor(actor3);

        movie2.addActor(actor1);
        movie2.addActor(actor2);

        actor1.addMovie(movie1);
        actor1.addMovie(movie2);

        actor2.addMovie(movie1);
        actor2.addMovie(movie2);

        actor3.addMovie(movie1);

        database.addActor(actor1);
        database.addActor(actor2);
        database.addActor(actor3);

        database.addMovie(movie1);
        database.addMovie(movie2);

        // Завдання 1
        System.out.println("Is there an actor who has not played in any movie? "
                + database.hasActorNotInAnyMovie());

        // Завдання 2
        Actor targetActor = actor1;
        List<Actor> coActors = database.getCoActors(targetActor);
        System.out.println("Actors who played with " + targetActor.getName() + ": " + coActors);

        // Завдання 3
        Movie movieWithMostActors = database.findMovieWithMostActors();
        System.out.println("Movie with the most actors: " + movieWithMostActors.getTitle());
    }
}
