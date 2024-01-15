import java.util.*;
public class InputSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int Sum=a+b;
        int Product=a*b;
        System.out.println("Sum of two no is:"+Sum);
        System.out.println("Product of two no is:"+Product);
    }
}