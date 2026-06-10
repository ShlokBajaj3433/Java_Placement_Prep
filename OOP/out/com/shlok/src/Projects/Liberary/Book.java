package Projects.Liberary;

public class Book {

private static long nextId = 1;
private static int totalInventory = 0;

Long ID;
String name;
String AuthorName;
String Category;
double Price;
int AvailableCopies;

public Book() {
	this("Unknown", "Ananomous", "Unknown", 0, 0);
}

public Book(String name) {
	this(name, "Ananomous", "Unkonwn", 0, 0);
}

public Book(String name, String authorName, String category, double price, int availableCopies) {
	this.ID = nextId++;
	this.name = (name == null || name.trim().isEmpty()) ? "Unknown Book" : name.trim();
	this.AuthorName = authorName.trim();
	this.Category = category.trim();
	this.Price = Math.max(0, price);
	this.AvailableCopies = Math.max(0, availableCopies);
	totalInventory += this.AvailableCopies;
}

public void Display() {
	System.out.println("ID: " + ID);
	System.out.println("Name: " + name);
	System.out.println("Author: " + AuthorName);
	System.out.println("Category: " + Category);
	System.out.println("Price: " + Price);
	System.out.println("Available Copies: " + AvailableCopies);
}

public boolean BorrowBook() {
	if (!isAvailable()) {
		return false;
	}
	AvailableCopies--;
	totalInventory--;
	return true;
}

public boolean returnBook() {
	AvailableCopies++;
	totalInventory++;
	return true;
}

public boolean isAvailable() {
	return AvailableCopies > 0;
}

public void UpdatePrice(double newPrice) {
	if (newPrice >= 0) {
		Price = newPrice;
	}
}

public static Book findCostliestBook(Book[] books) {
	if (books == null || books.length == 0) return null;
	Book costliest = null;
    
	for (Book book : books) {
		if (book != null && (costliest == null || book.Price > costliest.Price)) {
			costliest = book;
		}
	}
	return costliest;
}

public static Book findCheapestBook(Book[] books) {
	if (books == null || books.length == 0) return null;
	Book cheapest = null;
	for (Book book : books) {
		if (book != null && (cheapest == null || book.Price < cheapest.Price)) {
			cheapest = book;
		}
	}
	return cheapest;
}

public static int countBooksStartingWithJava(Book[] books) {
	if (books == null) return 0;
	int count = 0;
	for (Book book : books) {
		if (book != null && book.name != null && book.name.toLowerCase().startsWith("java")) {
			count++;
		}
	}
	return count;
}

public static int countBooksByAuthor(Book[] books, String author) {
	if (books == null || author == null) return 0;
	int count = 0;
	String target = author.trim().toLowerCase();
	for (Book book : books) {
		if (book != null && book.AuthorName != null && book.AuthorName.trim().toLowerCase().contains(target)) {
			count++;
		}
	}
	return count;
}

public static int getTotalInventory() {
	return totalInventory;
}


}
