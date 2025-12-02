import java.util.Scanner;

public class FactorsOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        n = Math.abs(n);

        if (n == 0) {
            System.out.println("Every integer is a factor of 0. Pointless to list.");
            return;
        }

        System.out.println("Factors of " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
