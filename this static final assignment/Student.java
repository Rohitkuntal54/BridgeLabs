public class Student {
   
    private static String universityName = "Global University";
    private static int totalStudents = 0;

   
    private String name;
    private final int rollNumber; 
    private String grade;

    
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; 
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students in " + universityName + ": " + totalStudents);
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for Roll No " + rollNumber + " to " + grade);
        } else {
            System.out.println("Invalid Student object!");
        }
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
            System.out.println("----------------------------------");
        } else {
            System.out.println("Invalid Student object!");
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, "A");
        Student student2 = new Student("Bob", 102, "B");
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student1.updateGrade("A+");
        student2.updateGrade("B+");
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        Student.displayTotalStudents();
    }
}

