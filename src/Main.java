import java.util.Scanner;
import java.util.ArrayList;

/**
 * Smart Campus Lost & Found Management System
 * Day 5: FoundItem class, Report Found Item, View Found Items, Search Item
 */
public class Main {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // ArrayList to store LostItem objects (from Day 4)
        ArrayList<LostItem> lostItems = new ArrayList<LostItem>();

        // Day 5: ArrayList to store FoundItem objects
        ArrayList<FoundItem> foundItems = new ArrayList<FoundItem>();

        // Welcome banner
        System.out.println("==================================================");
        System.out.println("   Smart Campus Lost & Found Management System    ");
        System.out.println("==================================================");

        // User Registration (from Day 2)
        System.out.println("\n--- Step 1: User Registration ---");
        System.out.print("Enter your Name       : ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter your Student ID : ");
        String studentId = scanner.nextLine().trim();

        System.out.print("Enter your Department : ");
        String department = scanner.nextLine().trim();

        // Create a User object and display their details
        User currentUser = new User(name, studentId, department);
        currentUser.displayUserDetails();

        // Flag to keep the app running
        boolean isRunning = true;

        // Main application loop
        while (isRunning) {

            displayMenu();

            System.out.print("Enter your choice (1-8): ");
            String choice = scanner.nextLine().trim();

            switch (choice) {

                case "1":
                    // Report a lost item and save it to the lostItems list
                    reportLostItem(scanner, lostItems);
                    break;

                case "2":
                    // Day 5: Report a found item and save it to foundItems list
                    reportFoundItem(scanner, foundItems);
                    break;

                case "3":
                    // View all lost items
                    viewLostItems(lostItems);
                    break;

                case "4":
                    // Day 5: View all found items
                    viewFoundItems(foundItems);
                    break;

                case "5":
                    // Day 5: Search by item name across both lists
                    searchItem(scanner, lostItems, foundItems);
                    break;

                case "6":
                    System.out.println("\n[!] Claim Item - Feature coming soon!");
                    break;

                case "7":
                    System.out.println("\n[!] Admin - Feature coming soon!");
                    break;

                case "8":
                    System.out.println("\nThank you, " + currentUser.getName() + ", for using Smart Campus Lost & Found System. Goodbye!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("\n[X] Invalid choice! Please enter a number between 1 and 8.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    // -----------------------------------------------------------------------

    /**
     * Prints the main menu options to the console.
     */
    public static void displayMenu() {
        System.out.println("----------------- MAIN MENU -----------------");
        System.out.println("1. Report Lost Item");
        System.out.println("2. Report Found Item");
        System.out.println("3. View Lost Items");
        System.out.println("4. View Found Items");
        System.out.println("5. Search Item");
        System.out.println("6. Claim Item");
        System.out.println("7. Admin");
        System.out.println("8. Exit");
        System.out.println("---------------------------------------------");
    }

    // -----------------------------------------------------------------------

    /**
     * Day 3 + Day 4:
     * Collects lost item details, creates a LostItem object,
     * and adds it to the lostItems ArrayList.
     */
    public static void reportLostItem(Scanner scanner, ArrayList<LostItem> lostItems) {

        System.out.println("\n========== REPORT A LOST ITEM ==========");

        System.out.print("Enter Item ID (e.g., L001)    : ");
        String itemId = scanner.nextLine().trim();

        System.out.print("Enter Item Name               : ");
        String itemName = scanner.nextLine().trim();

        System.out.print("Enter Description             : ");
        String description = scanner.nextLine().trim();

        System.out.print("Enter Location where lost     : ");
        String location = scanner.nextLine().trim();

        System.out.print("Enter Date Lost (DD-MMM-YYYY) : ");
        String dateLost = scanner.nextLine().trim();

        System.out.print("Enter Your Name               : ");
        String ownerName = scanner.nextLine().trim();

        // Create a LostItem object and add it to the list
        LostItem lostItem = new LostItem(itemId, itemName, description, location, dateLost, ownerName);
        lostItems.add(lostItem);

        System.out.println("\n[✓] Lost item reported and saved successfully!");
        lostItem.displayItem();
        System.out.println("  [Total lost items reported so far: " + lostItems.size() + "]");
    }

    // -----------------------------------------------------------------------

    /**
     * Day 5:
     * Collects found item details from the user using Scanner,
     * creates a FoundItem object, and adds it to the foundItems ArrayList.
     */
    public static void reportFoundItem(Scanner scanner, ArrayList<FoundItem> foundItems) {

        System.out.println("\n========== REPORT A FOUND ITEM ==========");

        // Collect each detail from the user — same pattern as reportLostItem
        System.out.print("Enter Item ID (e.g., F001)     : ");
        String itemId = scanner.nextLine().trim();

        System.out.print("Enter Item Name                : ");
        String itemName = scanner.nextLine().trim();

        System.out.print("Enter Description              : ");
        String description = scanner.nextLine().trim();

        System.out.print("Enter Location where found     : ");
        String location = scanner.nextLine().trim();

        System.out.print("Enter Date Found (DD-MMM-YYYY) : ");
        String dateFound = scanner.nextLine().trim();

        System.out.print("Enter Your Name (Finder)       : ");
        String finderName = scanner.nextLine().trim();

        // Create a FoundItem object using the constructor
        FoundItem foundItem = new FoundItem(itemId, itemName, description, location, dateFound, finderName);

        // Add it to the ArrayList
        foundItems.add(foundItem);

        System.out.println("\n[✓] Found item reported and saved successfully!");
        foundItem.displayItem();
        System.out.println("  [Total found items reported so far: " + foundItems.size() + "]");
    }

    // -----------------------------------------------------------------------

    /**
     * Day 4:
     * Displays ALL lost items stored in the ArrayList using a for-each loop.
     */
    public static void viewLostItems(ArrayList<LostItem> lostItems) {

        System.out.println("\n========== ALL LOST ITEMS ==========");

        // Check if the list is empty
        if (lostItems.isEmpty()) {
            System.out.println("  No lost items have been reported yet.");
            System.out.println("  Use option 1 from the menu to report a lost item.");
            return;
        }

        System.out.println("  Total items reported: " + lostItems.size());
        System.out.println("====================================");

        // For-each loop: visits every LostItem in the list one by one
        for (LostItem item : lostItems) {
            item.displayItem();
        }
    }

    // -----------------------------------------------------------------------

    /**
     * Day 5:
     * Displays ALL found items stored in the foundItems ArrayList.
     */
    public static void viewFoundItems(ArrayList<FoundItem> foundItems) {

        System.out.println("\n========== ALL FOUND ITEMS ==========");

        // Check if the list is empty
        if (foundItems.isEmpty()) {
            System.out.println("  No found items have been reported yet.");
            System.out.println("  Use option 2 from the menu to report a found item.");
            return;
        }

        System.out.println("  Total items reported: " + foundItems.size());
        System.out.println("=====================================");

        // For-each loop: visits every FoundItem in the list one by one
        for (FoundItem item : foundItems) {
            item.displayItem();
        }
    }

    // -----------------------------------------------------------------------

    /**
     * Day 5:
     * Asks the user to enter an item name to search.
     * Checks BOTH the lostItems list AND the foundItems list.
     * Uses equalsIgnoreCase() so "wallet" and "WALLET" both match.
     * Displays all matching items, or a "No match" message if none found.
     */
    public static void searchItem(Scanner scanner, ArrayList<LostItem> lostItems, ArrayList<FoundItem> foundItems) {

        System.out.println("\n========== SEARCH ITEM ==========");
        System.out.print("Enter item name to search : ");
        String searchName = scanner.nextLine().trim();

        // This flag tracks whether we found at least one matching result
        boolean found = false;

        // --- Search in Lost Items ---
        System.out.println("\n--- Results from Lost Items ---");
        for (LostItem item : lostItems) {
            // equalsIgnoreCase() compares two strings ignoring UPPER/lower case
            // "Wallet".equalsIgnoreCase("wallet") → true
            // "Wallet".equalsIgnoreCase("WALLET") → true
            if (item.itemName.equalsIgnoreCase(searchName)) {
                item.displayItem(); // Show this matching lost item
                found = true;       // Mark that we found at least one match
            }
        }

        // --- Search in Found Items ---
        System.out.println("\n--- Results from Found Items ---");
        for (FoundItem item : foundItems) {
            if (item.itemName.equalsIgnoreCase(searchName)) {
                item.displayItem(); // Show this matching found item
                found = true;       // Mark that we found at least one match
            }
        }

        // If 'found' is still false, no matches were found in either list
        if (!found) {
            System.out.println("\n  No matching item found for: \"" + searchName + "\"");
            System.out.println("  Please check the spelling and try again.");
        }
    }
}
