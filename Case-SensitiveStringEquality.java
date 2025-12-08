//Problem Statement:
//Given 2 strings S1 and s2, check whether they are case senitively equal without using any predefined function(case sensitive).If they are not same print 'no'

//Sample Input:
//guvi guvi

//Sample Output:
//yes

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s1.length() != s2.length()) {
            System.out.println("no");
            return;
        }
        boolean isEqual = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                isEqual = false;
                break;
            }
        }
        if (isEqual)
            System.out.println("yes");
        else
            System.out.println("no");

        sc.close();
    }
}
