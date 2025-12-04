import java.util.*;

public class Main {

    // O(log n) - Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (sorted array): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        long startTime = System.nanoTime();

        int index = binarySearch(arr, target);

        long endTime = System.nanoTime();

        double durationMs = (endTime - startTime) / 1_000_000.0;

        System.out.println("\nO(log n) - binarySearch");
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found.");
        System.out.println("Start Time   : " + startTime + " ns");
        System.out.println("End Time     : " + endTime + " ns");
        System.out.println("Execution ms : " + durationMs + " ms");

        sc.close();
    }
}

