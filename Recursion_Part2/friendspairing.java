package Recursion_Part2;

import java.util.*;

public class friendspairing {

    public static int pair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int fnm1 = pair(n - 1);
        int fnm2 = pair(n - 2);
        int pairways = (n - 1) * fnm2;
        int totalways = fnm1 + pairways;
        return totalways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pair(n));

    }
}
