public class LowScoreStudentInfo {
    // Fields to store student information
    private String name;
    private int score;

    // Constructor to initialize the fields
    public LowScoreStudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Method to display student information if score is less than 40
    public void displayInfo() {
        if (score < 40) {
            System.out.println("Name: " + name);
            System.out.println("Score: " + score);
            System.out.println("Status: Below Passing");
        } else {
            System.out.println(name + " has scored " + score + ", which is above passing.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating instances of LowScoreStudentInfo
        LowScoreStudentInfo student1 = new LowScoreStudentInfo("John", 35);
        LowScoreStudentInfo student2 = new LowScoreStudentInfo("Alice", 42);
        LowScoreStudentInfo student3 = new LowScoreStudentInfo("Bob", 38);

        // Displaying information for each student
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
}
}