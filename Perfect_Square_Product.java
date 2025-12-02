//Problem Statement:
//Given 2 numbers N,M. Print 'yes' if their product is a perfect square else print 'no'.
//Sample Input:
//5 5
//Sample Output:
//yes

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int M = obj.nextInt();
        int product = N * M;
        int perfect = (int)Math.sqrt(product);
        if(perfect * perfect == product)
        {
        System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}