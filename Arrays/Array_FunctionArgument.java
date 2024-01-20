package Arrays;
import java.util.*;
public class Array_FunctionArgument {
    public static void array(int marks[]){
        for(int i=0;i<marks.length;i++){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Value: ");
            marks[i]=sc.nextInt();
        }
    }
    
    public static void main(String[] args) {
        int marks[]={23,56,78};
        array(marks);
        for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]);
        }
        System.out.println();
    }
}
