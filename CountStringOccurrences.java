//Problem Statement:
//Given a sentence and string S, find how many times S occurs in the given sentence.If S is not found in the sentence print -1

//Input Description:
//Input Size : |sentence| <= 1000000(complexity O(n)).

//Output Description:
//The output is the number of times S occurs in the given sentence, or -1 if S is not found.

//Sample Input:
//I enjoy doing codekata
//codekata

//Sample Output:
//1

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String s = sc.nextLine();
        int count = 0;
        int n = sentence.length();
        int m = s.length();
        for(int i = 0;i <= n-m;i++)
        {
            int j = 0;
            while(j < m && sentence.charAt(i+j) == s.charAt(j))
            {
                j++;
            }
            if(j == m)
            {
                count++;
            }
        }
        if(count == 0)
        {
        System.out.print("-1");
        }
        else{
            System.out.print(count);
        }
    }
}
