package Loops;

public class Break{
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            if (i==4) {
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("I am out of the loop");
    }
    
}
