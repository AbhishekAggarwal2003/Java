package Conditional_Statements;
import java.util.*;
public class Q2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Temperature: ");
        double temp =sc.nextInt();
        if(temp>=100){
            System.out.println("High Fever");
        }
        else{
            System.out.println("Normal");
        }
    }
    
}
