package Loops;
import java.util.Scanner;
public class While2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to print the numbers");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
    
}
