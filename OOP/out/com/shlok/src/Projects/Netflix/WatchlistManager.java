package Projects.Netflix;

import java.util.*;

public class WatchlistManager {
    private List<Movie> watchlist = new ArrayList<>();

    // 1. Add a movie (Handles Blank Names)
    public void addMovie(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Error: Movie name cannot be blank.");
            return;
        }
        watchlist.add(new Movie(title));
        System.out.println("Added: " + title);
    }

    // 2. Add multiple movies
    public void addMultipleMovies(List<String> titles) {
        for (String title : titles) {
            addMovie(title);
        }
    }

    // 3. Remove a movie
    public void removeMovie(String title) {
        if (watchlist.isEmpty()) {
            System.out.println("Watchlist is empty. Nothing to remove.");
            return;
        }
        boolean removed = watchlist.removeIf(movie -> movie.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Removed: " + title);
        } else {
            System.out.println("Movie not found in watchlist.");
        }
    }

    // 4. Replace an existing movie (Handles Invalid Position)
    public void replaceMovie(int position, String newTitle) {
        // Adjusting for 0-based index (if user says position 1, it means index 0)
        int index = position - 1; 

        if (index < 0 || index >= watchlist.size()) {
            System.out.println("Error: Invalid replacement position.");
            return;
        }
        if (newTitle == null || newTitle.trim().isEmpty()) {
            System.out.println("Error: Replacement name cannot be blank.");
            return;
        }
        System.out.println("Replaced '" + watchlist.get(index).getTitle() + "' with '" + newTitle + "'");
        watchlist.set(index, new Movie(newTitle));
    }

    // 5. Display all movies (Handles Empty List)
    public void displayAll() {
        if (watchlist.isEmpty()) {
            System.out.println("Your watchlist is currently empty.");
            return;
        }
        System.out.println("--- Your Watchlist ---");
        for (int i = 0; i < watchlist.size(); i++) {
            System.out.println((i + 1) + ". " + watchlist.get(i).getTitle());
        }
    }

    // 6. Display in reverse order
    public void displayReverse() {
        if (watchlist.isEmpty()) {
            System.out.println("Your watchlist is empty.");
            return;
        }
        System.out.println("--- Watchlist (Reverse Order) ---");
        for (int i = watchlist.size() - 1; i >= 0; i--) {
            System.out.println((i + 1) + ". " + watchlist.get(i).getTitle());
        }
    }

    // 7. Sort movies alphabetically
    public void sortAlphabetically() {
        Collections.sort(watchlist);
        System.out.println("Watchlist sorted alphabetically.");
    }

    // 8. Display movies starting with a particular character
    public void displayStartingWith(char letter) {
        System.out.println("--- Movies starting with '" + letter + "' ---");
        boolean found = false;
        for (Movie m : watchlist) {
            if (m.getTitle().toLowerCase().charAt(0) == Character.toLowerCase(letter)) {
                System.out.println(m.getTitle());
                found = true;
            }
        }
        if (!found) System.out.println("No movies found.");
    }

    // 9. Count movies containing a given keyword
    public void countByKeyword(String keyword) {
        int count = 0;
        for (Movie m : watchlist) {
            if (m.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                count++;
            }
        }
        System.out.println("Found " + count + " movie(s) containing the keyword: '" + keyword + "'");
    }

    // 10. Display duplicate movie names
    public void displayDuplicates() {
        Set<Movie> uniqueMovies = new HashSet<>();
        Set<Movie> duplicates = new HashSet<>();

        for (Movie m : watchlist) {
            if (!uniqueMovies.add(m)) {
                duplicates.add(m); // If it can't be added to the unique set, it's a duplicate
            }
        }

        System.out.println("--- Duplicate Movies ---");
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            for (Movie d : duplicates) {
                System.out.println(d.getTitle());
            }
        }
    }

    // 11. Remove all duplicate movies while preserving order
    public void removeDuplicatesPreservingOrder() {
        // LinkedHashSet automatically removes duplicates but keeps insertion order
        Set<Movie> set = new LinkedHashSet<>(watchlist);
        watchlist.clear();
        watchlist.addAll(set);
        System.out.println("Duplicates removed. Order preserved.");
    }
}