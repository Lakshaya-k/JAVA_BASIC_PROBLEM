import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        n = Math.abs(n); // handle negative numbers

        int sum = 0;

        while (n > 0) {
            sum += n % 10;  // add the last digit
            n /= 10;        // remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
}
