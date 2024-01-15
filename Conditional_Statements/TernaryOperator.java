package Conditional_Statements;
import java.util.*;
public class TernaryOperator {
    public static void main(String args[]){
        int a=11;
        int b=20;
        int maxofbothnos=(a>b)?a:b;
        System.out.println("The maximum of both numbers is "+maxofbothnos);


        String type=(a%2==0)?"even":"odd";
        System.out.println("The number is "+type);

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks=sc.nextInt();
        String result=(marks>=33)?"pass":"fail";
        System.out.println("The result is "+result);
    }    
}
