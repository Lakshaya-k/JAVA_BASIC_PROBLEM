//Problem Statement:
//Given a number N, print its reverse.

//Input Description:
//Input Size : n <= 1000

//Sample Input:
//10

//Sample Output:
//1

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int rev =0;
        while(N > 0)
        {
            int digi = N % 10;
            rev = rev * 10 + digi;
            N = N / 10;
        }
        System.out.println(rev);
    }
}