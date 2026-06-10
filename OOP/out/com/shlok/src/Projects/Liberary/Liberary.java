package Projects.Liberary;

public class Liberary {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Pankaj", "Programming", 450.0, 10);
        Book b2 = new Book("Effective Java", "Joshua", "Programming", 650.0, 5);
        Book b3 = new Book("Java Complete", "Pankaj", "Programming", 550.0, 8);
        Book b4 = new Book("C Programming", "Dennis", "Programming", 300.0, 12);

        Book[] books = {
            b1,
            b2,
            b3,
            b4,
            new Book("Java Fundamentals", "Kathy", "Programming", 400.0, 7)
        };

        Book costliest = Book.findCostliestBook(books);
        Book cheapest = Book.findCheapestBook(books);
        int javaCount = Book.countBooksStartingWithJava(books);
        int pankajCount = Book.countBooksByAuthor(books, "Pankaj");

        System.out.println("Costliest Book:");
        costliest.Display();

        System.out.println();
        System.out.println("Cheapest Book:");
        cheapest.Display();

        System.out.println();
        System.out.println("Books starting with java: " + javaCount);
        System.out.println("Books by Pankaj: " + pankajCount);
        System.out.println("Total Available Copies: " + Book.getTotalInventory());
    }
}
