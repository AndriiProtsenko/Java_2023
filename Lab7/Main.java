import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        Actor actor1 = new Actor("Actor1");
        Actor actor2 = new Actor("Actor2");
        Actor actor3 = new Actor("Actor3");
        Actor actor4 = new Actor("Actor4");

        Movie movie1 = new Movie("Movie1");
        Movie movie2 = new Movie("Movie2");

         movie1.addActor(actor1);
        movie1.addActor(actor2);
        movie1.addActor(actor3);

        movie2.addActor(actor1);
        movie2.addActor(actor2);
        movie2.addActor(actor3);
        movie2.addActor(actor4);

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