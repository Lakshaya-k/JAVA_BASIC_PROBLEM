//Question:
//Given 3 numbers N , L and R. Print 'yes' if N is between L and R else print 'no'.
//Sample Input:
//3
//2 6
//Sample Output:
//yes
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        if(N > L && N < R)
        {
        System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}