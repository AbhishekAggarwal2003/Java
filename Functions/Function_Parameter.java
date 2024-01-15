package Functions;
import java.util.*;
public class Function_Parameter {
    public static void calculatesum1(int a,int b){  //parameters or formal parameters
        int sum=a+b;
        System.out.println("Sum is: "+sum);
    }

    public static int calculatesum2(int num1,int num2){  //parameters or formal parameters
        int sum=num1+num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b=sc.nextInt();
        calculatesum1(a,b);  //arguments

        int sum=calculatesum2(a, b);  //arguments
        System.out.println("Sum is: "+sum);
    }
    
}
