import java.util.ArrayList;
import java.util.List;

/**
 * Main application driver to present the MVP.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   INITIALIZING LIBRARY MANAGEMENT MVP    ");
        System.out.println("==========================================\n");

        // V4.0: Polymorphism - Superclass References
        // A list of LibraryItem can hold both Books and Magazines
        List<LibraryItem> inventory = new ArrayList<>();

        // Instantiating objects using overloaded constructors
        inventory.add(new Book("B001", "Clean Code", "Robert C. Martin", 464));
        inventory.add(new Book("B002", "The Pragmatic Programmer", "Andy Hunt")); // Uses the simpler constructor
        inventory.add(new Magazine("M001", "Wired", 312));
        inventory.add(new Magazine("M002", "National Geographic", 154));

        // Simulating some business logic (Encapsulation at work)
        inventory.get(1).checkOut(); // Checking out "The Pragmatic Programmer"

        System.out.println("--- CURRENT INVENTORY STATUS ---");
        
        // V4.0: Polymorphism - Dynamic Method Dispatch
        // We loop through the generic "LibraryItem" reference, but Java automatically 
        // knows whether to call the Book's getDetails() or the Magazine's getDetails().
        for (LibraryItem item : inventory) {
            System.out.println(item.getDetails());
        }
        
        System.out.println("\n==========================================");
        System.out.println("           END OF DEMONSTRATION           ");
        System.out.println("==========================================");
    }
}