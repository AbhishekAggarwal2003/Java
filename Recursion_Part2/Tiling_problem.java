package Recursion_Part2;

import java.util.*;

public class Tiling_problem {

    public static int tiling(int n) { // 2 x n floor size

        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical
        int fnm1 = tiling(n - 1);
        // horizontal
        int fnm2 = tiling(n - 2);

        int totlways = fnm1 + fnm2;
        return totlways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tiling(n));
    }
}
