//Problem Statement :
//Give a string print all possible palindromic substring position or pattern and with count.

//Input:
//Enter a string: ababa

//Output:
//Palindrome: "a" at positions [0, 0]
//Palindrome: "b" at positions [1, 1]
//Palindrome: "aba" at positions [0, 2]
//Palindrome: "a" at positions [2, 2]
//Palindrome: "bab" at positions [1, 3]
//Palindrome: "ababa" at positions [0, 4]
//Palindrome: "b" at positions [3, 3]
//Palindrome: "a" at positions [4, 4]

import java.util.Scanner;

public class PalindromicSubstrings {

    // Expand around center and print all palindromes found
    private static void expandAndPrint(String s, int left, int right, int[] count) {
        int n = s.length();
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            // Found a palindrome from left to right
            System.out.println("Palindrome: \"" 
                    + s.substring(left, right + 1) 
                    + "\" at positions [" + left + ", " + right + "]");
            count[0]++; // increment count
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int n = s.length();
        int[] count = new int[1]; // using array to modify inside method

        // Consider each index as center of odd-length palindromes
        for (int i = 0; i < n; i++) {
            expandAndPrint(s, i, i, count);       // odd-length
            expandAndPrint(s, i, i + 1, count);   // even-length
        }

        System.out.println("Total palindromic substrings: " + count[0]);
    }
}
