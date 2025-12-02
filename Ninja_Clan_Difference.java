//Problem Statement:
//Kabali is a brave warrior who with his group of young ninjas moves from one place to another to fight against his opponents. Before Fighting he just calculates one thing, the difference between his ninja number and the opponent's ninja number. From this difference he decides whether to fight or not. Kabali's ninja number is never greater than his opponent.

//Input Description:
//The input contains two numbers in every line. These two numbers in each line denotes the number ninjas in Kabali's clan and his opponent's clan .

//Output Description:
//print the absolute difference of number of ninjas between Kabali's clan and his opponent's clan. Each output should be in seperate line.

//Sample Input:
//100 200
//Sample Output:
//100

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kabali = sc.nextInt();
        int opp   = sc.nextInt();
        System.out.println(Math.abs(opp - kabali));
    }
}
