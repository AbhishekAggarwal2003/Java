package Pattern;

public class Character_Pattern {
    public static void main(String[] args) {
        char ch='A';
        //int ch=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
