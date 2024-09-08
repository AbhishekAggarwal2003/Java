package Recursion;

import java.util.Scanner;

public class xtothepowern {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1=power(x, n-1);
        // int xn = x * xnm1;
        // return xn;
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int x = sc.nextInt();
        System.out.println("Enter the power: ");
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }
}
