import java.util.*;

public class Main {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive calls
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        long startTime = System.nanoTime(); // Start time in nanoseconds

        int result = fibonacci(n);

        long endTime = System.nanoTime();   // End time in nanoseconds

        double executionTimeMs = (endTime - startTime) / 1_000_000.0; // convert to ms

        System.out.println("Fibonacci(" + n + ") = " + result);
        System.out.println("Start Time : " + startTime + " ns");
        System.out.println("End Time   : " + endTime + " ns");
        // O(2ⁿ) - Exponential time
        System.out.printf("Execution Time: %.3f ms\n", executionTimeMs);
    }
}
