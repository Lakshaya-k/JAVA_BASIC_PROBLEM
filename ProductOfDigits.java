//Problem Statement:
//Given a number N, print the product of the digits.

//Input Description:
//Input Size : N <= 100000000000

//Sample Input:
//2143

//Sample Output:
//24

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int temp = 1;
        while(N >0)
        {
            int digi = N % 10;
            temp *= digi;
            N/=10;
            
        }
        System.out.println(temp);
    }
}