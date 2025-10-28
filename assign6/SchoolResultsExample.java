package classobject;

import java.util.ArrayList;
import java.util.List;

// Subject class
class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}


class Student {
    private String name;
    private int rollNo;
    private List<Subject> subjects;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }
}

// GradeCalculator class
class GradeCalculator {
    public String calculateGrade(Student student) {
        int total = 0;
        for (Subject s : student.getSubjects()) {
            total += s.getMarks();
        }
        double average = total / (double) student.getSubjects().size();

        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 50) return "C";
        else return "D";
    }
}

// Demo
public class SchoolResultsExample {
    public static void main(String[] args) {
        Student student1 = new Student("John", 101);
        student1.addSubject(new Subject("Maths", 90));
        student1.addSubject(new Subject("Science", 85));

        GradeCalculator calc = new GradeCalculator();
        String grade = calc.calculateGrade(student1);

        System.out.println("Student: " + student1.getName());
        for (Subject s : student1.getSubjects()) {
            System.out.println("Subject: " + s.getName() + ", Marks: " + s.getMarks());
        }
        System.out.println("Final Grade: " + grade);
    }
}
