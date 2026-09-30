import java.util.Scanner;
import java.util.ArrayList;

/**
 * Admin class handles all admin-only actions.
 * Day 7: Admin can log in, view items, view claims, and approve/reject claims.
 *
 * All methods are 'static' so we can call them directly without creating an Admin object.
 */
public class Admin {

    // Hard-coded admin credentials (username and password)
    // In a real app these would be stored securely, but for beginners this is fine.
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD  = "admin123";

    // -----------------------------------------------------------------------

    /**
     * adminLogin() is called when the user selects option 7 from the main menu.
     * It asks for username and password.
     * If correct → shows the Admin Menu and lets admin do their work.
     * If incorrect → shows an error message and returns to the main menu.
     *
     * @param scanner    The Scanner for reading keyboard input
     * @param lostItems  The same lost items list from Main — not a new list
     * @param foundItems The same found items list from Main — not a new list
     * @param claims     The same claims list from Main — not a new list
     */
    public static void adminLogin(Scanner scanner,
                                  ArrayList<LostItem>  lostItems,
                                  ArrayList<FoundItem> foundItems,
                                  ArrayList<Claim>     claims) {

        System.out.println("\n========== ADMIN LOGIN ==========");
        System.out.print("Username : ");
        String username = scanner.nextLine().trim();

        System.out.print("Password : ");
        String password = scanner.nextLine().trim();

        // Check if the entered credentials match the stored ones
        // .equals() is used for String comparison — NOT ==
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {

            System.out.println("\n[✓] Login successful! Welcome, Admin.");

            // Show the admin menu in a loop until the admin chooses to exit
            adminMenu(scanner, lostItems, foundItems, claims);

        } else {
            // Wrong username or password
            System.out.println("\n[X] Invalid username or password. Access denied.");
        }
    }

    // -----------------------------------------------------------------------

    /**
     * adminMenu() shows the Admin Menu and processes admin choices.
     * Runs in a loop until the admin selects option 6 (Exit Admin).
     */
    private static void adminMenu(Scanner scanner,
                                   ArrayList<LostItem>  lostItems,
                                   ArrayList<FoundItem> foundItems,
                                   ArrayList<Claim>     claims) {

        boolean adminRunning = true;

        while (adminRunning) {

            // Print the Admin Menu
            System.out.println("\n========================================");
            System.out.println("              ADMIN MENU                ");
            System.out.println("========================================");
            System.out.println("1. View Lost Items");
            System.out.println("2. View Found Items");
            System.out.println("3. View Claims");
            System.out.println("4. Approve Claim");
            System.out.println("5. Reject Claim");
            System.out.println("6. Exit Admin");
            System.out.println("----------------------------------------");
            System.out.print("Enter your choice (1-6): ");

            String adminChoice = scanner.nextLine().trim();

            switch (adminChoice) {

                case "1":
                    // View all lost items — uses the SAME list from Main, not a new one
                    viewLostItemsAdmin(lostItems);
                    break;

                case "2":
                    // View all found items — uses the SAME list from Main
                    viewFoundItemsAdmin(foundItems);
                    break;

                case "3":
                    // View all claims — uses the SAME list from Main
                    viewClaimsAdmin(claims);
                    break;

                case "4":
                    // Approve a specific claim by its Claim ID
                    approveClaim(scanner, claims);
                    break;

                case "5":
                    // Reject a specific claim by its Claim ID
                    rejectClaim(scanner, claims);
                    break;

                case "6":
                    System.out.println("\n[✓] Exiting Admin Panel. Returning to Main Menu...");
                    adminRunning = false; // Exits the admin while loop
                    break;

                default:
                    System.out.println("\n[X] Invalid choice! Please enter a number between 1 and 6.");
                    break;
            }
        }
    }

    // -----------------------------------------------------------------------

    /**
     * Shows all lost items to the admin.
     * Uses the SAME lostItems ArrayList passed from Main — no duplicate list.
     */
    private static void viewLostItemsAdmin(ArrayList<LostItem> lostItems) {

        System.out.println("\n========== ALL LOST ITEMS (ADMIN VIEW) ==========");

        if (lostItems.isEmpty()) {
            System.out.println("  No lost items reported yet.");
            return;
        }

        System.out.println("  Total: " + lostItems.size());
        for (LostItem item : lostItems) {
            item.displayItem();
        }
    }

    // -----------------------------------------------------------------------

    /**
     * Shows all found items to the admin.
     */
    private static void viewFoundItemsAdmin(ArrayList<FoundItem> foundItems) {

        System.out.println("\n========== ALL FOUND ITEMS (ADMIN VIEW) ==========");

        if (foundItems.isEmpty()) {
            System.out.println("  No found items reported yet.");
            return;
        }

        System.out.println("  Total: " + foundItems.size());
        for (FoundItem item : foundItems) {
            item.displayItem();
        }
    }

    // -----------------------------------------------------------------------

    /**
     * Shows all claims to the admin.
     */
    private static void viewClaimsAdmin(ArrayList<Claim> claims) {

        System.out.println("\n========== ALL CLAIMS (ADMIN VIEW) ==========");

        if (claims.isEmpty()) {
            System.out.println("  No claims submitted yet.");
            return;
        }

        System.out.println("  Total: " + claims.size());
        for (Claim claim : claims) {
            claim.displayClaim();
        }
    }

    // -----------------------------------------------------------------------

    /**
     * Approve Claim:
     * Asks for a Claim ID, finds the matching claim in the list,
     * and changes its status from "Pending" to "Approved".
     */
    private static void approveClaim(Scanner scanner, ArrayList<Claim> claims) {

        System.out.println("\n========== APPROVE CLAIM ==========");
        System.out.print("Enter Claim ID to approve : ");
        String claimId = scanner.nextLine().trim();

        // Search for the claim in the list using a for-each loop
        for (Claim claim : claims) {

            // equalsIgnoreCase() so "c001" and "C001" both work
            if (claim.claimId.equalsIgnoreCase(claimId)) {

                // Found the matching claim — change its status
                claim.status = "Approved";
                System.out.println("\n[✓] Claim approved successfully!");
                claim.displayClaim();
                return; // Exit the method — job done
            }
        }

        // If we reach this line, the claim ID was not found in the list
        System.out.println("\n[X] Claim not found. Please check the Claim ID and try again.");
    }

    // -----------------------------------------------------------------------

    /**
     * Reject Claim:
     * Asks for a Claim ID, finds the matching claim in the list,
     * and changes its status from "Pending" to "Rejected".
     */
    private static void rejectClaim(Scanner scanner, ArrayList<Claim> claims) {

        System.out.println("\n========== REJECT CLAIM ==========");
        System.out.print("Enter Claim ID to reject : ");
        String claimId = scanner.nextLine().trim();

        // Search for the claim in the list
        for (Claim claim : claims) {

            if (claim.claimId.equalsIgnoreCase(claimId)) {

                // Found the claim — change its status to Rejected
                claim.status = "Rejected";
                System.out.println("\n[✓] Claim rejected successfully!");
                claim.displayClaim();
                return;
            }
        }

        // Claim ID not found
        System.out.println("\n[X] Claim not found. Please check the Claim ID and try again.");
    }
}
