import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        int a = sc.nextInt();
        int area=a*a;
        System.out.println("Area of square is: " + area);
    }
}
