//Problem Statement:
//Given 3 numbers a,b,c print a*b mod c.

//Sample Input:
//5 3 2

//Sample Output:
//1

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int A = obj.nextInt();
        int B = obj.nextInt();
        int C = obj.nextInt();
        int num = ((A * B) % C);
        System.out.println(num);
    }
}
