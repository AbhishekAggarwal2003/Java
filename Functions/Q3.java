package Functions;
import java.util.*;
public class Q3 {
    public static boolean palindrome(int n){
        int palindrome=n;
        int reverse=0;
        while (palindrome!=0){
            int r=palindrome%10;
            reverse=reverse*10+r;
            palindrome=palindrome/10;
        }
        if(n==reverse) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int n=sc.nextInt();
        if(palindrome(n)){
            System.out.println(n+" is a palindrome");
        }
        else{
            System.out.println(n+" is not a palindrome");
        }
    }
}
