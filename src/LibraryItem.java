/**
 * V1.0 & V2.0: Classes, Objects, and Encapsulation
 * This abstract class represents a generic item in the library.
 */
public abstract class LibraryItem {
    // Encapsulation: Fields are private to protect data integrity
    private String id;
    private String title;
    private boolean isCheckedOut;

    // Constructor to initialize objects
    public LibraryItem(String id, String title) {
        setId(id);       // Using setters in the constructor ensures validation rules apply
        setTitle(title);
        this.isCheckedOut = false;
    }

    // Encapsulation: Public getters and setters with validation logic
    public String getId() { return id; }
    
    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id;
        } else {
            this.id = "UNKNOWN";
        }
    }

    public String getTitle() { return title; }
    
    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            this.title = "Untitled";
        }
    }

    public boolean isCheckedOut() { return isCheckedOut; }
    
    public void checkOut() { this.isCheckedOut = true; }
    public void returnItem() { this.isCheckedOut = false; }

    /**
     * V4.0: Polymorphism (Foundation)
     * Abstract method that FORCES all subclasses to implement their own version.
     */
    public abstract String getDetails();
}