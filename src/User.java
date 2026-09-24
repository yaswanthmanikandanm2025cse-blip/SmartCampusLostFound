/**
 * User class representing a campus student or staff member.
 * Day 2: Understanding Classes, Objects, and Constructors.
 */
public class User {
    // Attributes (Instance Variables)
    private String name;
    private String studentId;
    private String department;

    /**
     * Constructor: A special method called automatically when creating a new User object.
     * It initializes the attributes of the object.
     *
     * @param name       The name of the user
     * @param studentId  The college/student ID of the user
     * @param department The department or major of the user
     */
    public User(String name, String studentId, String department) {
        this.name = name;
        this.studentId = studentId;
        this.department = department;
    }

    /**
     * Method to display the details of this User object in a clean format.
     */
    public void displayUserDetails() {
        System.out.println("\n----------------- USER PROFILE -----------------");
        System.out.println("Name        : " + this.name);
        System.out.println("Student ID  : " + this.studentId);
        System.out.println("Department  : " + this.department);
        System.out.println("------------------------------------------------");
    }

    // Getter methods: Allow reading the private attributes if needed
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }
}
