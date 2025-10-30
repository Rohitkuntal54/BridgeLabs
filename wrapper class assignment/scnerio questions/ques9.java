public class ques9 {
    public static void main(String[] args) {
        
        Object[] marks = {"85", 95, Integer.valueOf(88), "null", "abc", null};

        int total = 0;
        int count = 0;

        for (Object mark : marks) {
            Integer validMark = null;

            if (mark == null) {
                continue; 
            }

            if (mark instanceof Integer) {
                validMark = (Integer) mark; 
            } else if (mark instanceof String) {
                String strMark = (String) mark;
                if (!strMark.equalsIgnoreCase("null")) {
                    try {
                        validMark = Integer.parseInt(strMark); 
                    } catch (NumberFormatException e) {
                        
                        continue;
                    }
                }
            }

            if (validMark != null) {
                total += validMark; // auto-unboxing happens here
                count++;
            }
        }

        // Calculate average
        double average = (count > 0) ? (double) total / count : 0.0;

        System.out.println("--- Student Marks Report ---");
        System.out.println("Total of valid marks: " + total);
        System.out.println("Number of valid marks: " + count);
        System.out.println("Average marks: " + average);
    }
}

