//Problem Statement:
//Given a number N followed by N elements which can be arranged in ascending order with maximum one element update. Print the index of the element which has to be changed else print '-1' if the updation not neccassary or if the given input needs more than one update to form ascending order.

//Sample Input:
//7
//1 2 4 3 5 6 8
//5
//1 10 3 14 5

//Sample Output:
//2
//-1

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
           arr[i] = sc.nextInt();
        int index = -1; 
        int count = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] < arr[i - 1]) {
                count++;
                if(count > 1) {
                    index = -1;
                    break;
                }
                index = i - 1;   
                if(i - 2 >= 0 && arr[i] < arr[i - 2])
                    index = i;
            }
        }

        System.out.println(index);
    }
}
