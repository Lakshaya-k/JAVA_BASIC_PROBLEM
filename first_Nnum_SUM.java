import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        int N = sc.nextInt();

        int sum = N * (N + 1) / 2;

        System.out.println("Sum of first " + N + " natural numbers is: " + sum);
    }
}

