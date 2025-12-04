import java.util.*;

public class Main {

    // O(n²) - Quadratic time
    public static void printAllPairs(int[] arr) {
        int dummy = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                dummy += arr[i] + arr[j]; // small dummy computation
            }
        }
        if (dummy == -1) System.out.println("Impossible");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        long startTime = System.nanoTime();

        printAllPairs(arr);

        long endTime = System.nanoTime();

        double durationMs = (endTime - startTime) / 1_000_000.0;

        System.out.println("\nO(n²) - printAllPairs");
        System.out.println("Start Time   : " + startTime + " ns");
        System.out.println("End Time     : " + endTime + " ns");
        System.out.println("Execution ms : " + durationMs + " ms");

        sc.close();
    }
}

