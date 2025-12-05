//Problem Statement:
//Given 3 numbers A,B,C find the sum of Arithmetic Series with a=A, d=B and n=C

//Sample Input:
//1 1 2

//Sample Output:
//3

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int A = obj.nextInt();
        int B = obj.nextInt();
        int C = obj.nextInt();
        int sum = (C * (2 * A +(C - 1)* B)) / 2;
        System.out.println(sum);
    }
}