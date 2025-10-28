package AssistedProblems;

import java.util.*;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showDept() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.show();
        }
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showDept();
        }
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee(new Employee("Rahul"));
        d1.addEmployee(new Employee("Ankit"));

        d2.addEmployee(new Employee("Priya"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompany();
    }
}