public class Employee {
   
    private static String companyName = "Tech Solutions Ltd";
    private static int totalEmployees = 0;

    private String name;
    private final int id;  
    private String designation;

   
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; 
    }

    
    public static void displayTotalEmployees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
    }

   
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("Company: " + companyName);
            System.out.println("----------------------------------");
        } else {
            System.out.println("Invalid Employee object!");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob", 102, "Project Manager");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}

