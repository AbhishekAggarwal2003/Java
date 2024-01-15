package Operators;

public class Unary {
    public static void main(String[] args) {
        int a = 10;
        int b=++a; // a=11, b=11
        System.out.println(a); // 11
        System.out.println(b); // 11
        int c=a++; // a=12, c=11
        System.out.println(a); // 12
        System.out.println(b); // 11
        System.out.println(c); // 11
    }
}
