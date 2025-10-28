class Student {
    void displayStudentDetails() {
        System.out.println("Student Name: Rohit Kuntal");
        System.out.println("Roll Number: 101");
    }
}

class Faculty {
    void displayFacultyDetails() {
        System.out.println("Faculty Name: Ashutosh Sir");
        System.out.println("Subject: Computer Science");
    }
}

public class ques1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayStudentDetails();

        System.out.println();

        Faculty f = new Faculty();
        f.displayFacultyDetails();
    }
}
