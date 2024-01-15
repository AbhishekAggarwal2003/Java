package Arrays;
import java.util.*;
public class Input_Output_Array {
    public static void main(String[] args) {
        int marks[]=new int[50];
        System.out.println("Length of Array: "+marks.length);
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        System.out.print("Enter Marks of Physics: ");
        marks[0]=sc.nextInt(); //Insertion
        System.out.print("Enter Marks of Chemistry: ");
        marks[1]=sc.nextInt(); //Insertion
        System.out.print("Enter Marks of Mathematics: ");
        marks[2]=sc.nextInt(); //Insertion
        System.out.println("Marks of Physics: "+marks[0]);
        System.out.println("Marks of Chemistry: "+marks[1]);
        System.out.println("Marks of Mathematics: "+marks[2]);
        marks[2]=90; //Updation
        System.out.println("Updated Marks of Mathematics: "+marks[2]);
        marks[2]=marks[2]+3;
        System.out.println("Updated Marks of Mathematics: "+marks[2]);

        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage: "+percentage);
    }
}
