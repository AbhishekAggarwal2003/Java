package Functions;
import java.util.*;

import Conditional_Statements.Switch;
public class Product {
    public static int product(int a,int b){
        int prod=a*b;
        return prod;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st No: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd No: ");
        int b=sc.nextInt();
        System.out.println("Product of "+a+" and "+b+" is "+product(a,b));
    }
}
