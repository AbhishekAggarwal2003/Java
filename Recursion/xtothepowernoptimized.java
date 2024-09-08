package Recursion;

import java.util.Scanner;

public class xtothepowernoptimized {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = power(x, n / 2) * power(x, n / 2);
        if (n % 2 != 0) {
            halfpower = x * halfpower;
        }
        return halfpower;
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
