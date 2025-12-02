//Question:
//Given a number N, find its next immediate greater power of 2(i.e 2^1, 2^2, 2^3...).
//Input Description:
//The input consists of a number N where N <= 1000.
//Sample Input:
//4
//Sample Output:
//8
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p =1;
        while(p <= N)
        {
            p *= 2;
        }
        System.out.println(p);
    }
}