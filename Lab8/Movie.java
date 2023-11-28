import java.util.HashSet;
import java.util.Set;

public class Movie {
    private String title;
    private Set<Actor> actors;

    public Movie(String title) {
        this.title = title;
        this.actors = new HashSet<>();
    }

    public String getTitle() {
        return title;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }
}
