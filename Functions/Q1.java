package Functions;
import java.util.*;
public class Q1 {
    
    public static int average(int a, int b, int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c=sc.nextInt();
        System.out.println("Average of "+a+", "+b+", "+c+" is: "+average(a,b,c));
    }
}
