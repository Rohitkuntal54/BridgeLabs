import java.util.*;

public class Q14_ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> subjects = new HashMap<>();

        Map<String, Integer> math = new HashMap<>();
        math.put("Amit", 85);
        math.put("Riya", 92);
        math.put("John", 78);

        Map<String, Integer> science = new HashMap<>();
        science.put("Amit", 88);
        science.put("Riya", 95);
        science.put("John", 90);

        subjects.put("Math", math);
        subjects.put("Science", science);

        // Topper per subject
        for (String sub : subjects.keySet()) {
            String topper = "";
            int max = 0;

            for (String stu : subjects.get(sub).keySet()) {
                int m = subjects.get(sub).get(stu);
                if (m > max) {
                    max = m;
                    topper = stu;
                }
            }
            System.out.println(sub + " topper → " + topper);
        }

        // Average per subject
        for (String sub : subjects.keySet()) {
            int sum = 0;
            for (int m : subjects.get(sub).values()) sum += m;
            System.out.println(sub + " average → " + sum / subjects.get(sub).size());
        }

        // Subjects where someone > 90
        System.out.println("Subjects with score > 90:");
        for (String sub : subjects.keySet()) {
            for (int m : subjects.get(sub).values()) {
                if (m > 90) {
                    System.out.println(sub);
                    break;
                }
            }
        }
    }
}
