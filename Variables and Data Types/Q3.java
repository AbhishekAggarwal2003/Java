import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pencil: ");
        float a = sc.nextFloat();
        System.out.println("Enter cost of eraser: ");
        float b = sc.nextFloat();
        System.out.println("Enter cost of pen: ");
        float c = sc.nextFloat();
        float total=a+b+c;
        float totalwithgst=total+(total*0.18f);
        System.out.println("Total cost of the items is: " + total);
        System.out.println("Total cost of the items with GST is: " + totalwithgst);
    }
}
