package selfproblem;

import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Faculty: " + name);
    }
}

class DepartmentU {
    private String name;

    public DepartmentU(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Department: " + name);
    }
}

class University {
    private String name;
    private List<DepartmentU> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    public void addDepartment(DepartmentU d) {
        departments.add(d);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void showUniversity() {
        System.out.println("University: " + name);
        for (DepartmentU d : departments) d.show();
        for (Faculty f : faculties) f.show();
    }
}

public class UniversityExample {
    public static void main(String[] args) {
        University u = new University("GLA University");

        u.addDepartment(new DepartmentU("CSE"));
        u.addDepartment(new DepartmentU("ECE"));

        u.addFaculty(new Faculty("Prof. Sharma"));
        u.addFaculty(new Faculty("Prof. Gupta"));

        u.showUniversity();
    }
}
