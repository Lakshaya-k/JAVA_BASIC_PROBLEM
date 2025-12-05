//Problem Statement:
//Given 2 numbers N and K followed by N elements,print the number of repetition of K otherwise print '-1' if the element not found.

//Sample Input:
//6 2
//1 2 3 5 7 8

//Sample Output:
//1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if(x == K) {
                count++;
            }
        }
        if(count == 0)
            System.out.println("-1");
        else
            System.out.println(count);
    }
}
