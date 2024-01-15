import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");//Enter your name
        String name = sc.nextLine();//whole line as input
        System.out.println("Hello " + name + "!");

        System.out.print("Enter your name: ");//Enter your name
        String name2= sc.next();//single word as input
        System.out.println("Hello " + name2 + "!");

        System.out.println("Enter your Age: ");//Enter your age
        int age = sc.nextInt();//integer as input
        System.out.println("Your age is " + age);

        System.out.println("Enter your CGPA: ");//Enter your CGPA
        double cgpa = sc.nextDouble();//double as input
        System.out.println("Your CGPA is " + cgpa);

        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum is " + c);


        System.out.println("Hello World!");
    }
}
