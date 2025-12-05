//Problem Statement:
//Given 2 numbers N and K followed by elements of N .Print 'yes' if K exists else print 'no'.

//Input Description:
//The input consists of two integers, N and K, followed by N integers.

//Output Description:
//The output is 'yes' if K is found among the N integers, otherwise 'no'.

//Sample Input:
//4 2
//1 2 3 3

//Sample Output:
//yes

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int found = 0;
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if(x == K) {
                found = 1;
            }
        }
        if(found == 1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
