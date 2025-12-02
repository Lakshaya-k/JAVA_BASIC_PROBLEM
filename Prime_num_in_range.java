import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower bound (L): ");
        int L = sc.nextInt();

        System.out.print("Enter upper bound (R): ");
        int R = sc.nextInt();

        System.out.println("Prime numbers between " + L + " and " + R + ":");

        for (int n = Math.max(L, 2); n <= R; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(n + " ");
        }
    }
}
