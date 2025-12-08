//Problem Statement:
//Write a program to print the sum of the first K natural numbers.

//Input Description:
//Input Size : n <= 100000

//Sample Input:
//3

//Sample Output:
//6

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long sum = (long) K * (K + 1) / 2;
        System.out.println(sum);

        sc.close();
    }
}
