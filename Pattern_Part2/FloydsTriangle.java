package Pattern_Part2;

public class FloydsTriangle {
    public static void Pattern(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(5);
    }
    
}
