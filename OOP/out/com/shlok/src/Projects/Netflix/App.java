package Projects.Netflix;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        WatchlistManager manager = new WatchlistManager();

        System.out.println("Edge Case: Testing empty watchlist");
        manager.displayAll();
        manager.removeMovie("Inception");

        System.out.println("\nAdding Movies...");
        manager.addMovie("Stranger Things");
        manager.addMovie("Breaking Bad");
        manager.addMovie("  "); // Edge Case: Blank name

        System.out.println("\nAdding Multiple Movies...");
        manager.addMultipleMovies(Arrays.asList("Inception", "The Dark Knight", "Inception", "Interstellar", "Stranger Things"));

        System.out.println("\nCurrent List:");
        manager.displayAll();

        System.out.println("\nEdge Case: Replacing with Invalid Position...");
        manager.replaceMovie(10, "The Matrix"); // Invalid
        
        System.out.println("\nReplacing position 2...");
        manager.replaceMovie(2, "Better Call Saul");

        System.out.println("\nDisplay Reverse:");
        manager.displayReverse();

        System.out.println("\nSearch & Count:");
        manager.displayStartingWith('I');
        manager.countByKeyword("The");

        System.out.println("\nHandling Duplicates:");
        manager.displayDuplicates();
        manager.removeDuplicatesPreservingOrder();

        System.out.println("\nList after removing duplicates:");
        manager.displayAll();

        System.out.println("\nSorting:");
        manager.sortAlphabetically();
        manager.displayAll();
    }
}