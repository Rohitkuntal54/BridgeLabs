import java.util.*;

public class Q6_Attendance {
    public static void main(String[] args) {

        Map<String, Integer> attendance = new HashMap<>();
        String[] students = {"Amit", "Riya", "Karan", "John", "Sita"};

        for (String s : students) attendance.put(s, 0);

        String[][] days = {
                {"Amit", "Riya"},
                {"Riya", "Karan"},
                {"Amit", "John"},
                {"John"},
                {"Sita", "Amit"},
                {"Riya"},
                {"Amit", "Karan"},
                {"John"},
                {"Sita"},
                {"Amit", "Riya"},
                {"Karan"},
                {"John"},
                {"Amit"},
                {"Sita"},
                {"Riya"}
        };

        for (String[] present : days) {
            for (String name : present) {
                attendance.put(name, attendance.get(name) + 1);
            }
        }

        System.out.println("Less than 10 days:");
        for (String s : attendance.keySet()) {
            if (attendance.get(s) < 10)
                System.out.println(s + " → " + attendance.get(s));
        }
    }
}
