interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee implements Department {
    private double bonus; private String dept;
    public FullTimeEmployee(int id, String name, double base, double bonus) {
        super(id, name, base); this.bonus = bonus;
    }
    public double calculateSalary() { return getBaseSalary() + bonus; }
    public void assignDepartment(String d) { dept = d; }
    public String getDepartmentDetails() { return "Dept: " + dept; }

    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails() + ", Total: " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hours; private double rate; private String dept;
    public PartTimeEmployee(int id, String name, double base, int h, double r) {
        super(id, name, base); hours = h; rate = r;
    }
    public double calculateSalary() { return getBaseSalary() + hours * rate; }
    public void assignDepartment(String d) { dept = d; }
    public String getDepartmentDetails() { return "Dept: " + dept; }

    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails() + ", Total: " + calculateSalary());
    }
}

public class ques1 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Alice", 50000, 10000);
        Employee e2 = new PartTimeEmployee(102, "Bob", 20000, 80, 200);

        ((Department)e1).assignDepartment("IT");
        ((Department)e2).assignDepartment("HR");

        for (Employee e : new Employee[]{e1, e2})
            e.displayDetails();
    }
}
