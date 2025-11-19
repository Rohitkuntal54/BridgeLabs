import java.util.*;

public class Q1_StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();

        // 1. Add students
        grades.put("Amit", 85.0);
        grades.put("Riya", 92.5);
        grades.put("Karan", 76.0);

        // 2. Update grade
        grades.put("Karan", 80.0);

        // 3. Remove a student
        grades.remove("Amit");

        // 4. Print sorted by name
        TreeMap<String, Double> sorted = new TreeMap<>(grades);
        for (String name : sorted.keySet()) {
            System.out.println(name + " → " + sorted.get(name));
        }
    }
}
