package Loops;
import java.util.*;
public class Prime_or_not {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=2;i<n;i++){
        if(n%i==0){
            System.out.println(n+" is not a Prime Number");
            break;
        }
        else{
            System.out.println(n+" is a Prime Number");
            break;
        }
    }
}
}

