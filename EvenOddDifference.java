//Problem Statement:
//Given 2 numbers N,M. Find their difference and check whether it is even or odd.

//Sample Input:
//5 5

//Sample Output:
//even

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int M = obj.nextInt();
        int diff = M - N;
        if(diff % 2 == 0)
        {
        System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}