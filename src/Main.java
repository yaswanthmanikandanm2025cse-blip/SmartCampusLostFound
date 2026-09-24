import java.util.Scanner;

/**
 * Smart Campus Lost & Found Management System
 * Day 2: Classes, Objects, Constructors, and User Profile Demonstration
 */
public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Welcome banner
        System.out.println("==================================================");
        System.out.println("   Smart Campus Lost & Found Management System    ");
        System.out.println("==================================================");

        // Day 2 Task: Capture user details from keyboard using Scanner
        System.out.println("\n--- Step 1: User Registration ---");
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter your Student ID: ");
        String studentId = scanner.nextLine().trim();

        System.out.print("Enter your Department: ");
        String department = scanner.nextLine().trim();

        // Day 2 Task: Create a User object using the constructor
        User currentUser = new User(name, studentId, department);

        // Day 2 Task: Call the method to display the entered user details
        currentUser.displayUserDetails();

        // Flag variable to keep the application running until the user chooses to exit
        boolean isRunning = true;

        // Main application loop (from Day 1)
        while (isRunning) {
            // Display the menu options
            displayMenu();

            // Prompt the user for their choice
            System.out.print("Enter your choice (1-8): ");
            String choice = scanner.nextLine().trim();

            // Process the user's menu selection using a switch statement
            switch (choice) {
                case "1":
                    System.out.println("\n[!] Report Lost Item - Feature coming soon!");
                    break;
                case "2":
                    System.out.println("\n[!] Report Found Item - Feature coming soon!");
                    break;
                case "3":
                    System.out.println("\n[!] View Lost Items - Feature coming soon!");
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
}
