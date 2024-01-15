package Loops;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int n = sc.nextInt();
    int a=n;
    for(int i=1;i<n;i++){
        a=a*(n-i);
    }
    System.out.println("Factorial of "+n+" is: "+a);
}
}
