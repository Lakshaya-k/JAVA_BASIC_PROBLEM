//Problem Statement:
//Given a number N followed by N elements, find the second smallest element.If it cannot be found then print -1

//Input Description:
//Input Size : N <= 100000 (ie do it in O(log n) time complexity)

//Sample Input:
//5
//1 2 3 4 5

//Sample Output:
//2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N < 2) {
            System.out.println(-1);
            return;
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int val = arr[i];

            if (val < smallest) {
                secondSmallest = smallest;
                smallest = val;
            } else if (val > smallest && val < secondSmallest) {
                secondSmallest = val;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(secondSmallest);
        }

        sc.close();
    }
}

