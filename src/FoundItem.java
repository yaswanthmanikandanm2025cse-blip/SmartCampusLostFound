/**
 * FoundItem class represents an item that has been found on campus.
 * Day 5: Similar to LostItem but for found items — has finderName instead of ownerName.
 */
public class FoundItem {

    // ---- Attributes (Fields) ----
    // Every FoundItem object will hold these 6 pieces of information.

    String itemId;       // Unique report ID for this found item (e.g., "F001")
    String itemName;     // Name of the found item (e.g., "Blue Water Bottle")
    String description;  // Extra details (e.g., "Has a sticker on the cap")
    String location;     // Where the item was found (e.g., "Cafeteria Table 4")
    String dateFound;    // Date when it was found (e.g., "27-Sep-2026")
    String finderName;   // The name of the person who found the item

    /**
     * Constructor: Runs automatically when we create a new FoundItem object.
     * It receives 6 values and stores them inside the object.
     */
    public FoundItem(String itemId, String itemName, String description,
                     String location, String dateFound, String finderName) {

        // 'this.itemId' = the field of THIS object
        // 'itemId' (right side) = the value passed in from Main.java
        this.itemId      = itemId;
        this.itemName    = itemName;
        this.description = description;
        this.location    = location;
        this.dateFound   = dateFound;
        this.finderName  = finderName;
    }

    /**
     * displayItem() prints all the details of this found item neatly.
     * 'void' means it does not return anything — it just prints.
     */
    public void displayItem() {
        System.out.println("\n========== FOUND ITEM REPORT ==========");
        System.out.println("  Item ID      : " + this.itemId);
        System.out.println("  Item Name    : " + this.itemName);
        System.out.println("  Description  : " + this.description);
        System.out.println("  Found At     : " + this.location);
        System.out.println("  Date Found   : " + this.dateFound);
        System.out.println("  Finder Name  : " + this.finderName);
        System.out.println("  Status       : FOUND");
        System.out.println("========================================");
    }
}
