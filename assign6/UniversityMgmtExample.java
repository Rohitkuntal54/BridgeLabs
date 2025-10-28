package selfproblem;

import java.util.*;

class Professor {
    private String name;

    public Professor(String name) { this.name = name; }
    public String getName() { return name; }
}

class Course {
    private String code;
    String title;
    private Professor professor; // association
    private List<Student> students;

    public Course(String code, String title) {
        this.code = code; this.title = title;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.getName() + " assigned to " + code + " - " + title);
    }

    public void enrollStudent(Student s) {
        if (!students.contains(s)) {
            students.add(s);
            s.addCourse(this); // two-way association
        }
    }

    public void showCourseInfo() {
        System.out.println("Course: " + code + " - " + title);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not assigned"));
        System.out.println("Enrolled students:");
        for (Student s : students) System.out.println(" - " + s.getName());
    }

    public String getCode() { return code; }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name; this.courses = new ArrayList<>();
    }

    public String getName() { return name; }

    // called by Course.enrollStudent to keep relation both ways
    public void addCourse(Course c) {
        if (!courses.contains(c)) courses.add(c);
    }

    public void enrollCourse(Course c) {
        c.enrollStudent(this);
        System.out.println(name + " enrolled in " + c.getCode());
    }

    public void showCourses() {
        System.out.println("Student " + name + " is enrolled in:");
        for (Course c : courses) System.out.println(" - " + c.getCode() + " : " + c.title);
    }
}

public class UniversityMgmtExample {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Sharma");
        Professor prof2 = new Professor("Dr. Mehta");

        Course c1 = new Course("CS101", "Intro to Programming");
        Course c2 = new Course("CS201", "Data Structures");

        c1.assignProfessor(prof1);
        c2.assignProfessor(prof2);

        Student s1 = new Student("Ayush");
        Student s2 = new Student("Mohan");

       
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        System.out.println();
        c1.showCourseInfo();
        System.out.println();
        c2.showCourseInfo();
        System.out.println();
        s1.showCourses();
        System.out.println();
        s2.showCourses();
    }
}
