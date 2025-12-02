//Question:
//Given a string S, print it after changing the middle element to * (if the length of the string is even, change the 2 middle elements to *).
//Sample Input:
//hello
//Sample Output:
//he*lo
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = 0;
        for(char c : s.toCharArray()) {
            len++;
        }
        char[] arr = new char[len];
        int i = 0;
        for(char c : s.toCharArray()) {
            arr[i] = c;
            i++;
        }
        int mid = len / 2;

        if(len % 2 == 1) {
            arr[mid] = '*';  
        } else {
            arr[mid - 1] = '*';
            arr[mid] = '*';
        }
        for(int j = 0; j < len; j++) {
            System.out.print(arr[j]);
        }
    }
}
