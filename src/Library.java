import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * V5.0: Collection Management
 * The Library class manages the collection of LibraryItems.
 */
public class Library {
    private List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public List<LibraryItem> getAllItems() {
        return items;
    }

    public List<LibraryItem> searchByTitle(String title) {
        return items.stream()
                .filter(item -> item.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }

    public boolean checkOutItem(String id) {
        for (LibraryItem item : items) {
            if (item.getId().equalsIgnoreCase(id) && !item.isCheckedOut()) {
                item.checkOut();
                return true;
            }
        }
        return false;
    }

    public boolean returnItem(String id) {
        for (LibraryItem item : items) {
            if (item.getId().equalsIgnoreCase(id) && item.isCheckedOut()) {
                item.returnItem();
                return true;
            }
        }
        return false;
    }
}
