import java.util.*;

public class Main {

    // O(n) - Linear time
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        long startTime = System.nanoTime();

        int result = findMax(arr);

        long endTime = System.nanoTime();

        double durationMs = (endTime - startTime) / 1_000_000.0;

        System.out.println("\nO(n) - findMax");
        System.out.println("Maximum Value: " + result);
        System.out.println("Start Time   : " + startTime + " ns");
        System.out.println("End Time     : " + endTime + " ns");
        System.out.println("Execution ms : " + durationMs + " ms");

        sc.close();
    }
}

