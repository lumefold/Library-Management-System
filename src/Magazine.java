/**
 * V3.0: Inheritance
 * Magazine "is-a" LibraryItem.
 */
public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    /**
     * V4.0: Polymorphism - Method Overriding (Runtime)
     * Provides a Magazine-specific implementation of getDetails()
     */
    @Override
    public String getDetails() {
        String status = isCheckedOut() ? "[Checked Out]" : "[Available]";
        return String.format("%s MAGAZINE: '%s', Issue #%d - ID: %s", 
                             status, getTitle(), issueNumber, getId());
    }
}