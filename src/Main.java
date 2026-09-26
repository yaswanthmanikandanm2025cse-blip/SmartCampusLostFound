import java.util.Scanner;
import java.util.ArrayList;

/**
 * Smart Campus Lost & Found Management System
 * Day 4: ArrayList to store multiple LostItem objects + View Lost Items feature
 */
public class Main {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Day 4: Create an ArrayList to store multiple LostItem objects.
        // Think of ArrayList as a resizable list/box that can hold many items.
        // <LostItem> means this list will ONLY hold LostItem objects.
        ArrayList<LostItem> lostItems = new ArrayList<LostItem>();

        // Welcome banner
        System.out.println("==================================================");
        System.out.println("   Smart Campus Lost & Found Management System    ");
        System.out.println("==================================================");

        // Day 2: Capture user details from keyboard using Scanner
        System.out.println("\n--- Step 1: User Registration ---");
        System.out.print("Enter your Name       : ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter your Student ID : ");
        String studentId = scanner.nextLine().trim();

        System.out.print("Enter your Department : ");
        String department = scanner.nextLine().trim();

        // Create a User object using the constructor
        User currentUser = new User(name, studentId, department);

        // Call the method to display the entered user details
        currentUser.displayUserDetails();

        // Flag variable to keep the application running until the user chooses to exit
        boolean isRunning = true;

        // Main application loop
        while (isRunning) {

            // Display the menu options
            displayMenu();

            // Prompt the user for their choice
            System.out.print("Enter your choice (1-8): ");
            String choice = scanner.nextLine().trim();

            // Process the user's menu selection using a switch statement
            switch (choice) {

                case "1":
                    // Day 3 + Day 4: Report a lost item and ADD it to the ArrayList
                    reportLostItem(scanner, lostItems);
                    break;

                case "2":
                    System.out.println("\n[!] Report Found Item - Feature coming soon!");
                    break;

                case "3":
                    // Day 4: View all lost items stored in the ArrayList
                    viewLostItems(lostItems);
                    break;

                case "4":
                    System.out.println("\n[!] View Found Items - Feature coming soon!");
                    break;

                case "5":
                    System.out.println("\n[!] Search Item - Feature coming soon!");
                    break;

                case "6":
                    System.out.println("\n[!] Claim Item - Feature coming soon!");
                    break;

                case "7":
                    System.out.println("\n[!] Admin - Feature coming soon!");
                    break;

                case "8":
                    System.out.println("\nThank you, " + currentUser.getName() + ", for using Smart Campus Lost & Found System. Goodbye!");
                    isRunning = false; // Ends the while loop
                    break;

                default:
                    System.out.println("\n[X] Invalid choice! Please enter a number between 1 and 8.");
                    break;
            }

            // Print an empty line for clean visual spacing in the terminal
            System.out.println();
        }

        // Close the scanner resource before exiting
        scanner.close();
    }

    // -----------------------------------------------------------------------

    /**
     * Helper method to print the 8 menu options to the console.
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
     * Collects lost item details from the user using Scanner,
     * creates a LostItem object, and ADDS it to the ArrayList.
     *
     * @param scanner   The Scanner to read keyboard input
     * @param lostItems The ArrayList where the new item will be stored
     */
    public static void reportLostItem(Scanner scanner, ArrayList<LostItem> lostItems) {

        System.out.println("\n========== REPORT A LOST ITEM ==========");

        // Collect each detail from the user
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

        // Create a LostItem object using the constructor
        LostItem lostItem = new LostItem(itemId, itemName, description, location, dateLost, ownerName);

        // Day 4: ADD the new LostItem object into the ArrayList
        // .add() puts the item at the END of the list
        lostItems.add(lostItem);

        // Show a success message and display the item details
        System.out.println("\n[✓] Lost item reported and saved successfully!");
        lostItem.displayItem();

        // Tell the user how many items are currently in the list
        System.out.println("  [Total lost items reported so far: " + lostItems.size() + "]");
    }

    // -----------------------------------------------------------------------

    /**
     * Day 4:
     * Displays ALL lost items stored in the ArrayList using a for-each loop.
     * If no items have been reported yet, shows a friendly message.
     *
     * @param lostItems The ArrayList containing all reported LostItem objects
     */
    public static void viewLostItems(ArrayList<LostItem> lostItems) {

        System.out.println("\n========== ALL LOST ITEMS ==========");

        // First, check if the list is empty using .isEmpty()
        // .isEmpty() returns true if there are no items in the list
        if (lostItems.isEmpty()) {
            System.out.println("  No lost items have been reported yet.");
            System.out.println("  Use option 1 from the menu to report a lost item.");
            return; // Exit the method early — nothing more to show
        }

        // Display total count
        System.out.println("  Total items reported: " + lostItems.size());
        System.out.println("====================================");

        // For-each loop: goes through EVERY item in the ArrayList one by one
        // 'item' is a temporary variable that holds the current LostItem in each round
        for (LostItem item : lostItems) {
            item.displayItem(); // Call the display method on each LostItem object
        }
    }
}
