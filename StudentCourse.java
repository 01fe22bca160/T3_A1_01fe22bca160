/**
 * The StudentCourse class represents a student and their courses and marks.
 */
public class StudentCourse {
    private String name;
    private String[] courses;
    private int[] marks;

    // The code you provided is a constructor for the StudentCourse class. A constructor is a special
    // method that is used to initialize the object of a class.
    public StudentCourse(String name, String[] courses, int[] marks) {
        this.name = name;
        this.courses = courses;
        this.marks = marks;
    }

    /**
     * The function displays the student's name, along with the courses they are enrolled in and their
     * corresponding marks.
     */
    public void displayCoursesAndMarks() {
        System.out.println("Student: " + name);
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course: " + courses[i] + ", Mark: " + marks[i]);
        }
    }

    public static void main(String[] args) {
        String[] courses = {"Math", "Science", "History"};
        int[] marks = {85, 90, 75};
        StudentCourse student = new StudentCourse("John Doe", courses, marks);
        student.displayCoursesAndMarks();
}
}