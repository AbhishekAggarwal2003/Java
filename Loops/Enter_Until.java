package Loops;
import java.util.*;
public class Enter_Until {
    public static void main(String[] args) {
        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Number: ");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }
    }
    
}
