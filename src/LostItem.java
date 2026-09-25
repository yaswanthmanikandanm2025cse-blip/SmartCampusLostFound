/**
 * LostItem class represents an item that has been reported as lost on campus.
 * Day 3: Learning to create another class with a constructor and a display method.
 */
public class LostItem {

    // ---- Attributes (Fields) ----
    // Each LostItem object will hold these 6 pieces of information.

    String itemId;       // A unique ID to identify this lost item report (e.g., "L001")
    String itemName;     // The name of the lost item (e.g., "Black Wallet")
    String description;  // More details about the item (e.g., "Has 3 cards inside")
    String location;     // Where the item was last seen (e.g., "Library - Floor 2")
    String dateLost;     // The date when it was lost (e.g., "25-Sep-2026")
    String ownerName;    // The name of the person who lost the item

    /**
     * Constructor: Automatically called when we create a new LostItem object.
     * It takes 6 values and stores them inside the object.
     */
    public LostItem(String itemId, String itemName, String description,
                    String location, String dateLost, String ownerName) {

        // 'this.itemId' means the field belonging to THIS object
        // 'itemId' (right side) is the value passed in from Main.java
        this.itemId      = itemId;
        this.itemName    = itemName;
        this.description = description;
        this.location    = location;
        this.dateLost    = dateLost;
        this.ownerName   = ownerName;
    }

    /**
     * displayItem() method prints all the details of this lost item neatly.
     * 'void' means this method does not return any value — it just prints.
     */
    public void displayItem() {
        System.out.println("\n========== LOST ITEM REPORT ==========");
        System.out.println("  Item ID     : " + this.itemId);
        System.out.println("  Item Name   : " + this.itemName);
        System.out.println("  Description : " + this.description);
        System.out.println("  Lost At     : " + this.location);
        System.out.println("  Date Lost   : " + this.dateLost);
        System.out.println("  Owner Name  : " + this.ownerName);
        System.out.println("  Status      : LOST");
        System.out.println("======================================");
    }
}
