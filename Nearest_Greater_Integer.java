//Question:
//Given a floating point number with 1 decimal place round it off to nearest greater integer and print it.
//Sample Input:
//2.6
//Sample Output:
//3
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double N = obj.nextDouble();
        int M = (int)Math.ceil(N);
        System.out.println(M);
    }
}