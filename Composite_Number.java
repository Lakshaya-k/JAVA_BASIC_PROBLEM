//Problem Statement:
//Given a number N, print 'yes' if it is composite else print 'no'.
//Sample Input:
//123
//Sample Output:
//yes

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        if(N<=1)
        {
            System.out.println("no");
            return;
        }
        Boolean composite = false;
        for(int i=2; i*i <= N;i++)
        {
            if(N % i==0)
            {
                composite = true;
                break;
            }
        }
        if(composite)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}