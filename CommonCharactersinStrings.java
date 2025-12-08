//Problem Statement:
//Given 2 strings,check whether they have any common characters.If found print 'yes' else print 'no'.

//Input Description:
//Input Size : |s| <= 100000(O(n))

//Sample Input:
//guvi guvigeeks

//Sample Output:
//yes

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        boolean[] present = new boolean[256]; 

        for (char c : s1.toCharArray()) {
            present[c] = true;
        }
        for (char c : s2.toCharArray()) {
            if (present[c]) {
                System.out.println("yes");
                return;
            }
        }

        System.out.println("no");
    }
}
