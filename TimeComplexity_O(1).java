import java.util.*;

public class Main {

    // O(1) - Constant time
    public static int getFirstElement(int[] arr) {
        return arr[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        long startTime = System.nanoTime();

        int result = getFirstElement(arr);

        long endTime = System.nanoTime();

        double durationMs = (endTime - startTime) / 1_000_000.0;

        System.out.println("\nO(1) - getFirstElement");
        System.out.println("First Element: " + result);
        System.out.println("Start Time   : " + startTime + " ns");
        System.out.println("End Time     : " + endTime + " ns");
        System.out.println("Execution ms : " + durationMs + " ms");

        sc.close();
    }
}

