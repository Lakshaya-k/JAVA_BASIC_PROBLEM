//Problem Statement:
//Find the minimum among 10 numbers.

//Input Description:
//The input consists of 10 space-separated integers.

//Output Description:
//The output is the minimum of the given 10 integers.

//Sample Input:
//5 4 3 2 1 7 6 10 8 9

//Sample Output:
//1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;  

        for(int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if(num < min) {
                min = num;
            }
        }

        System.out.println(min);
    }
}
