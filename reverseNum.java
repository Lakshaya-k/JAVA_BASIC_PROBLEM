import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Reverse Number:");

        while(n>0){
            int rev = 0;
            rev = n % 10;
            System.out.print(rev);
            n=n/10;
        }
    }