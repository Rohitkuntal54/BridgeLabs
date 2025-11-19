import java.util.*;

public class Q9_SalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> sal = new HashMap<>();

        sal.put("Amit", 30000.0);
        sal.put("Riya", 45000.0);
        sal.put("John", 50000.0);
        sal.put("Sita", 48000.0);
        sal.put("Karan", 35000.0);
        sal.put("Neha", 52000.0);

        // Raise for Riya
        sal.put("Riya", sal.get("Riya") * 1.10);

        // Average
        double sum = 0;
        for (double v : sal.values()) sum += v;
        System.out.println("Average = " + sum / sal.size());

        // Highest salary
        double max = Collections.max(sal.values());

        System.out.println("Highest paid:");
        for (String name : sal.keySet()) {
            if (sal.get(name) == max)
                System.out.println(name + " → " + sal.get(name));
        }
    }
}
