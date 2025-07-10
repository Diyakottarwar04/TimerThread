import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LibraryItem {
    String title;
    String id;

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("------------------------");
    }
}

class Book extends LibraryItem {
    String author;

    public Book(String title, String id, String author) {
        super(title, id);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book");
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("Author: " + author);
        System.out.println("------------------------");
    }
}

class Magazine extends LibraryItem {
    String issue;

    public Magazine(String title, String id, String issue) {
        super(title, id);
        this.issue = issue;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine");
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("Issue: " + issue);
        System.out.println("------------------------");
    }
}

public class LibraryMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<LibraryItem> items = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            // MENU
            System.out.println("\n==== Library Menu ====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Display All Items");
            System.out.println("4. Search by Title");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("Enter Book Title: ");
                    String bookTitle = sc.nextLine();
                    System.out.print("Enter Book ID: ");
                    String bookId = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    items.add(new Book(bookTitle, bookId, author));
                    System.out.println("Book added!");
                    break;

                case 2:
                    // Add Magazine
                    System.out.print("Enter Magazine Title: ");
                    String magTitle = sc.nextLine();
                    System.out.print("Enter Magazine ID: ");
                    String magId = sc.nextLine();
                    System.out.print("Enter Issue: ");
                    String issue = sc.nextLine();
                    items.add(new Magazine(magTitle, magId, issue));
                    System.out.println("Magazine added!");
                    break;

                case 3:
                    // Display All Items
                    if (items.isEmpty()) {
                        System.out.println("No items in library.");
                    } else {
                        System.out.println("\n=== All Library Items ===");
                        for (LibraryItem item : items) {
                            item.displayDetails();
                        }
                    }
                    break;

                case 4:
                    // Search by Title
                    System.out.print("Enter title to search: ");
                    String searchTitle = sc.nextLine().toLowerCase();
                    boolean found = false;
                    for (LibraryItem item : items) {
                        if (item.title.toLowerCase().contains(searchTitle)) {
                            item.displayDetails();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No item found with title containing: " + searchTitle);
                    }
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
