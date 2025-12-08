//Problem Statement:
//Given a string 'S' and a character 'K', find how many times 'K' got repeated in 'S'.If 'K' is not found in 'S' print -1

//Input Description:
//The input consists of a string 'S' and a character 'K'. The size of string 'S' is at most 100000.

//Output Description:
//The output is the count of character 'K' in string 'S'. If 'K' is not found, print -1.

//Sample Input:
//codekata a

//Sample Output:
//2


import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the string and the character
        String S = sc.next();     // reads the string
        char K = sc.next().charAt(0); // reads the next character

        int count = 0;

        // Loop through the string and count matches
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == K) {
                count++;
            }
        }

        // If character not found, print -1
        if (count == 0)
            System.out.println(-1);
        else
            System.out.println(count);
    }
}
