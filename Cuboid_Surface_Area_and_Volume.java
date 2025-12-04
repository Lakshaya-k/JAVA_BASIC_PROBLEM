//Problem Statement:
//Write a program to calculate the total surface area and volume of cuboid.

//Input Description:
//Input contains three space separated positive integers L, B, H denoting the length, width and height of cuboid respectively.

//Output Description:
//The output should be the total surface area and volume of the cuboid, separated by a space.

//Sample Input:
//1 2 3

//Sample Output:
//22 6

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int L = obj.nextInt();
        int B = obj.nextInt();
        int H = obj.nextInt();
        int surfarea = 2 * (L*B + B*H + L*H);
        int volume = L * B * H;
        System.out.printf(surfarea+" "+volume);
    }
}
