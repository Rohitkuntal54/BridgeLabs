package selfproblem;

import java.util.*;

class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void enroll(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public void enrollInCourse(Course c) {
        courses.add(c);
        c.enroll(this);
    }

    public void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

public class SchoolExample {
    public static void main(String[] args) {
        School school = new School("GLA School");

        Student s1 = new Student("Ayush");
        Student s2 = new Student("Rohan");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);
        s2.enrollInCourse(c1);

        school.addStudent(s1);
        school.addStudent(s2);

        school.showStudents();
        s1.showCourses();
        s2.showCourses();
        c1.showStudents();
    }
}
