import java.util.*;

public class Q13_Department {
    public static void main(String[] args) {
        Map<Integer, String> emp = new HashMap<>();

        emp.put(101, "HR");
        emp.put(102, "IT");
        emp.put(103, "Sales");
        emp.put(104, "IT");
        emp.put(105, "HR");

        // Change department
        emp.put(103, "IT");

        // Reverse lookup
        String dept = "IT";
        System.out.println("Employees in IT:");
        for (int id : emp.keySet()) {
            if (emp.get(id).equals(dept))
                System.out.println(id);
        }

        // Count per department
        Map<String, Integer> count = new HashMap<>();
        for (String d : emp.values()) {
            count.put(d, count.getOrDefault(d, 0) + 1);
        }

        System.out.println(count);
    }
}
