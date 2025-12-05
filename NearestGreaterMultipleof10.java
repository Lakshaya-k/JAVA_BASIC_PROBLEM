//Problem Statement:
//Given a number N, find the nearest greater multiple of 10.

//Input Description:
//Input Size : N <= 10000

//Sample Input:
//3

//Sample Output:
//10

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = ((n / 10) + 1) * 10;
        System.out.println(result);
    }
}