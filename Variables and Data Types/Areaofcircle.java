import java.util.*;
public class Areaofcircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float r = sc.nextInt();
        float area = 3.14f*r*r;
        System.out.println("Area of circle is "+area);
    }
}