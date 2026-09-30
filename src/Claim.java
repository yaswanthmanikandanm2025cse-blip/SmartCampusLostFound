/**
 * Claim class represents a student's request to claim an item.
 * Day 6: Every claim starts with status = "Pending".
 *        The admin can later change it to "Approved" or "Rejected".
 */
public class Claim {

    // ---- Fields (Attributes) ----
    String claimId;      // Unique ID for this claim (e.g., "C001")
    String itemId;       // ID of the item being claimed (e.g., "L001")
    String studentId;    // Student's college ID (e.g., "22CS101")
    String studentName;  // Full name of the student making the claim
    String reason;       // Why the student thinks this item belongs to them
    String status;       // Current status: "Pending", "Approved", or "Rejected"

    /**
     * Constructor: Called automatically when we write 'new Claim(...)'.
     * Notice: status is NOT a parameter — we always set it to "Pending" by default.
     * This means every new claim starts as Pending until an admin reviews it.
     */
    public Claim(String claimId, String itemId, String studentId,
                 String studentName, String reason) {

        this.claimId     = claimId;
        this.itemId      = itemId;
        this.studentId   = studentId;
        this.studentName = studentName;
        this.reason      = reason;
        this.status      = "Pending";   // Default status — always starts as Pending
    }

    /**
     * displayClaim() prints all details of this claim neatly.
     */
    public void displayClaim() {
        System.out.println("\n========== CLAIM DETAILS ==========");
        System.out.println("  Claim ID     : " + this.claimId);
        System.out.println("  Item ID      : " + this.itemId);
        System.out.println("  Student ID   : " + this.studentId);
        System.out.println("  Student Name : " + this.studentName);
        System.out.println("  Reason       : " + this.reason);
        System.out.println("  Status       : " + this.status);
        System.out.println("====================================");
    }
}
