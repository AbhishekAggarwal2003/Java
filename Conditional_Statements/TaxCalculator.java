package Conditional_Statements;
import java.util.*;
public class TaxCalculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income");
        float income=sc.nextFloat();
        if (income<500000){
            System.out.println("No Tax");
        }
        else if(income>=500000 && income<1000000){
            System.out.println("Tax is 20%");
        }
        else if(income>=1000000 && income<1500000){
            System.out.println("Tax is 30%");
        }
        else{
            System.out.println("Tax is 40%");
        }
    }
    
}
