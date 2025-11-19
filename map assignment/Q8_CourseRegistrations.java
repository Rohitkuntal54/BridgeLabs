import java.util.*;

public class Q8_CourseRegistrations {
    public static void main(String[] args) {
        Map<String, Integer> reg = new HashMap<>();

        reg.put("CS101", 45);
        reg.put("CS102", 4);
        reg.put("CS103", 60);
        reg.put("CS104", 10);
        reg.put("CS105", 2);

        // Add student
        reg.put("CS102", reg.get("CS102") + 1);

        // Drop student (not negative)
        String code = "CS105";
        reg.put(code, Math.max(0, reg.get(code) - 3));

        System.out.println("Near full (>=50):");
        for (String c : reg.keySet()) {
            if (reg.get(c) >= 50) System.out.println(c);
        }

        System.out.println("Under (<5):");
        for (String c : reg.keySet()) {
            if (reg.get(c) < 5) System.out.println(c);
        }
    }
}
