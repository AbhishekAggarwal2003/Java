package Operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a += b; // a = a + b
        System.out.println(a); // 30
        a -= b; // a = a - b
        System.out.println(a); // 10
        a *= b; // a = a * b
        System.out.println(a); // 200
        a /= b; // a = a / b
        System.out.println(a); // 10
        a %= b; // a = a % b
        System.out.println(a); // 10
    }
    
}
