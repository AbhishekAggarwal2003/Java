package Loops;
import java.util.*;
public class Reverse_of_a_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        long n=sc.nextLong();
        long rev=0;
        while(n>0){
            long LastDigit=n%10;
            System.out.print(LastDigit);
            rev =(rev*10)+LastDigit;
            n=n/10;
        }
        System.out.println();
        System.out.println(rev);
    }
    
}
