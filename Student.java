public class Student {
    // These lines of code are declaring private instance variables for the Student class. Each
    // variable represents a specific attribute of a student, such as their name, USN (University
    // Serial Number), program, and department. By making these variables private, they can only be
    // accessed within the Student class itself.
    private String name;
    private String usn;
    private String program;
    private String department;

    // Constructor
    public Student(String name, String usn, String program, String department) {
        this.name = name;
        this.usn = usn;
        this.program = program;
        this.department = department;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Program: " + program);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        // Creating a student object and passing details
        Student student = new Student("John Doe", "123456", "Computer Science", "BCA");
        // Displaying student details
        student.displayDetails();
}
}