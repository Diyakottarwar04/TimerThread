import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Basic class for Library Item
class LibraryItem {
    String title;
    String id;

    LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("---------------------------");
    }
}

// Book class
class Book extends LibraryItem {
    String author;

    Book(String title, String id, String author) {
        super(title, id);
        this.author = author;
    }

    @Override
    void displayDetails() {
        System.out.println("Book");
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("Author: " + author);
        System.out.println("---------------------------");
    }
}

// Magazine class
class Magazine extends LibraryItem {
    String issue;

    Magazine(String title, String id, String issue) {
        super(title, id);
        this.issue = issue;
    }

    @Override
    void displayDetails() {
        System.out.println("Magazine");
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("Issue: " + issue);
        System.out.println("---------------------------");
    }
}

// Main menu class
public class LibraryMenu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<LibraryItem> items = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            // Display menu
            System.out.println("\n====== LIBRARY MENU ======");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Display All Items");
            System.out.println("4. Search by Title");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            // Switch-case to handle user choice
            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("Enter Book Title: ");
                    String bTitle = sc.nextLine();
                    System.out.print("Enter Book ID: ");
                    String bId = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String bAuthor = sc.nextLine();
                    items.add(new Book(bTitle, bId, bAuthor));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    // Add Magazine
                    System.out.print("Enter Magazine Title: ");
                    String mTitle = sc.nextLine();
                    System.out.print("Enter Magazine ID: ");
                    String mId = sc.nextLine();
                    System.out.print("Enter Issue: ");
                    String mIssue = sc.nextLine();
                    items.add(new Magazine(mTitle, mId, mIssue));
                    System.out.println("Magazine added successfully!");
                    break;

                case 3:
                    // Display all items
                    if (items.isEmpty()) {
                        System.out.println("No items in the library.");
                    } else {
                        System.out.println("\n=== Library Items ===");
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
                    System.out.println("Exiting... Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again!");
            }
        }

        sc.close();
    }
}
