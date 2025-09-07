import java.util.Arrays;

public class ques_1 {

    // Generate random heights between 150 and 250 cm for the players
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // 150 to 250 inclusive
        }
        return heights;
    }

    // Find sum of all elements in the array
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int height : arr) {
            sum += height;
        }
        return sum;
    }

    // Find mean height of players
    public static double findMean(int[] arr) {
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }

    // Find shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int height : arr) {
            min = Math.min(min, height);
        }
        return min;
    }

    // Find tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int height : arr) {
            max = Math.max(max, height);
        }
        return max;
    }

    public static void main(String[] args) {
        int teamSize = 11;
        int[] heights = generateHeights(teamSize);

        System.out.println("Heights of players (cm): " + Arrays.toString(heights));
        System.out.println("Shortest height: " + findShortest(heights) + " cm");
        System.out.println("Tallest height: " + findTallest(heights) + " cm");
        System.out.printf("Mean height: %.2f cm\n", findMean(heights));
    }
}
