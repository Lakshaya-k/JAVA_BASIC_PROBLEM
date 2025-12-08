//Problem Statement:
//Given a string 'S' and a character 'K', find at what position the character 'K' occurs for the first time in 'S'.(Assume the index of string starts at 1).If the character is not found in 'S' then print -1

//Input Description:
//Input Size : |s| <= 100000

//Sample Input:
//codekata a

//Sample Output:
//6

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();  // input string
        char K = sc.next().charAt(0);  // input character

        int position = -1;  // default if not found

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == K) {
                position = i + 1; // +1 because position starts at 1
                break; // stop after finding first occurrence
            }
        }

        System.out.println(position);

        sc.close();
    }
}

