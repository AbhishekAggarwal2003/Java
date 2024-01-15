package Conditional_Statements;
import java.util.*;
public class ElseIf {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("You can vote and drive now");
        }
        else if(age>16){
            System.out.println("You can drive now");
        }
        else{
            System.out.println("You can't do anything");
        }
    }
}
