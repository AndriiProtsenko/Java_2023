import java.util.ArrayList;
import java.util.List;

public class Movie {
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
