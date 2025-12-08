//Problem Statement:
//Given a string S, find its length(including the spaces)without using any pre-defined functions.

//Sample Input:
//codekata

//Sample Output:
//8

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String userInput = obj.nextLine();
        int count =0;
        for(char c : userInput.toCharArray())
        {
            count++;
        }
        System.out.printf("%d" , count);
    }
}

