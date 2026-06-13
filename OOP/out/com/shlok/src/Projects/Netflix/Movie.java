package Projects.Netflix;
import java.util.*;

public class Movie implements Comparable<Movie> {
    private String title;

    public Movie(String title) {
        this.title = title.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.trim();
    }

    @Override
    public String toString() {
        return title;
    }

    // Sort alphabetically (ignoring case)
    @Override
    public int compareTo(Movie other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    // Treat movies with the same name (case-insensitive) as duplicates
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return title.equalsIgnoreCase(movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase());
    }
}