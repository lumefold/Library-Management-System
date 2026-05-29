/**
 * V3.0: Inheritance
 * Book "is-a" LibraryItem. It inherits id, title, and checkout status.
 */
public class Book extends LibraryItem {
    private String author;
    private int pageCount;

    /**
     * V4.0: Polymorphism - Method Overloading (Compile-time)
     * Constructor 1: Basic book information
     */
    public Book(String id, String title, String author) {
        super(id, title); // Calls the superclass (LibraryItem) constructor
        this.author = author;
        this.pageCount = 0; // Default
    }

    /**
     * V4.0: Polymorphism - Method Overloading (Compile-time)
     * Constructor 2: Detailed book information including page count
     */
    public Book(String id, String title, String author, int pageCount) {
        super(id, title); 
        this.author = author;
        this.pageCount = pageCount;
    }

    /**
     * V4.0: Polymorphism - Method Overriding (Runtime)
     * Provides a Book-specific implementation of getDetails()
     */
    @Override
    public String getDetails() {
        String status = isCheckedOut() ? "[Checked Out]" : "[Available]";
        return String.format("%s BOOK: '%s' by %s (%d pages) - ID: %s", 
                             status, getTitle(), author, pageCount, getId());
    }
}