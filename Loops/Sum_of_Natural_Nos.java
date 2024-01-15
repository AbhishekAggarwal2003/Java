package Loops;
import java.util.*;
public class Sum_of_Natural_Nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the last no until which you want to cal the sum: ");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while (i<=n) {
            sum=sum+i;
            i++;
        }
        System.out.print("Sum of first "+n+" natural numbers is: "+sum);
    }
    
}
