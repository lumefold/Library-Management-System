import java.util.Scanner;
import java.util.List;

/**
 * Main application driver - Updated for V5.0 with interactive menu.
 */
public class Main {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Pre-populate some data
        library.addItem(new Book("B001", "Clean Code", "Robert C. Martin", 464));
        library.addItem(new Book("B002", "The Pragmatic Programmer", "Andy Hunt"));
        library.addItem(new Magazine("M001", "Wired", 312));

        boolean running = true;
        while (running) {
            printHeader();
            System.out.println("1. View All Items");
            System.out.println("2. Add Book");
            System.out.println("3. Add Magazine");
            System.out.println("4. Search by Title");
            System.out.println("5. Check Out Item");
            System.out.println("6. Return Item");
            System.out.println("0. Exit");
            System.out.print("\nSelect an option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1": viewAllItems(); break;
                case "2": addBook(); break;
                case "3": addMagazine(); break;
                case "4": searchByTitle(); break;
                case "5": checkOutItem(); break;
                case "6": returnItem(); break;
                case "0": running = false; break;
                default: System.out.println("Invalid option. Try again.");
            }
        }
        System.out.println("Goodbye!");
    }

    private static void printHeader() {
        System.out.println("\n==========================================");
        System.out.println("      LIBRARY MANAGEMENT SYSTEM V5.0      ");
        System.out.println("==========================================");
    }

    private static void viewAllItems() {
        System.out.println("\n--- CURRENT INVENTORY ---");
        List<LibraryItem> items = library.getAllItems();
        if (items.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            for (LibraryItem item : items) {
                System.out.println(item.getDetails());
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Page Count (optional, press Enter to skip): ");
        String pagesStr = scanner.nextLine();
        
        if (pagesStr.isEmpty()) {
            library.addItem(new Book(id, title, author));
        } else {
            int pages = Integer.parseInt(pagesStr);
            library.addItem(new Book(id, title, author, pages));
        }
        System.out.println("Book added successfully.");
    }

    private static void addMagazine() {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Issue Number: ");
        int issue = Integer.parseInt(scanner.nextLine());
        
        library.addItem(new Magazine(id, title, issue));
        System.out.println("Magazine added successfully.");
    }

    private static void searchByTitle() {
        System.out.print("Enter title search term: ");
        String query = scanner.nextLine();
        List<LibraryItem> results = library.searchByTitle(query);
        if (results.isEmpty()) {
            System.out.println("No items found matching: " + query);
        } else {
            for (LibraryItem item : results) {
                System.out.println(item.getDetails());
            }
        }
    }

    private static void checkOutItem() {
        System.out.print("Enter ID to check out: ");
        String id = scanner.nextLine();
        if (library.checkOutItem(id)) {
            System.out.println("Item checked out.");
        } else {
            System.out.println("Item not found or already checked out.");
        }
    }

    private static void returnItem() {
        System.out.print("Enter ID to return: ");
        String id = scanner.nextLine();
        if (library.returnItem(id)) {
            System.out.println("Item returned.");
        } else {
            System.out.println("Item not found or not checked out.");
        }
    }
}
