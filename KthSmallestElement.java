//Problem Statement:
//Given 2 numbers N and K followed by N elements, find the Kth smallest element. If the element cannot be found then print -1

//Input Description:
//The input consists of two numbers N and K, followed by N elements. N <= 100000.

//Output Description:
//The output is the Kth smallest element. If the element cannot be found, print -1.

//Sample Input:
//5 2
//1 1 2 4 5

//Sample Output:
//2

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        if (K <= 0 || K > N) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(arr); 

        int distinctCount = 1;  
        int prev = arr[0];
        for (int i = 1; i < N; i++) {
            if (arr[i] != prev) {
                distinctCount++;
                prev = arr[i];
            }
            if (distinctCount == K) {
                System.out.println(arr[i]);
                sc.close();
                return;
            }
        }
        System.out.println(-1);
        sc.close();
    }
}

