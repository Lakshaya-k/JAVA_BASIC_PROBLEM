//Problem Statement:
//Given a number N, print 'yes' if it is a multiple of 13 else print 'no'.
//Sample Input:
//26
//Sample Output:
//yes

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        if(N % 13 == 0)
        {
        System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}