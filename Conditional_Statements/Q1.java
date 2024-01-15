package Conditional_Statements;
import java.util.Scanner;
public class Q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a=sc.nextInt();
        if(a>=0){
            System.out.println("The Number is Positive");
        }
        else{
            System.out.println("The Number is Negative");
        } 
    }
}