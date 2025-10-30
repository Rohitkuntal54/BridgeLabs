import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); 

        Integer numObject = Integer.valueOf(num);
        System.out.println("\n--- Results ---");
        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object value: " + numObject);

        scanner.close();
    }
}
