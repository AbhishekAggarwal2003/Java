package Pattern_Part2;

public class InvertedHalfPyramidNumber {
    public static void Pattern(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(5);
    }
    
}
