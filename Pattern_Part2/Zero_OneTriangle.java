package Pattern_Part2;

public class Zero_OneTriangle {
    public static void Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2!=0){
                System.out.print(0);
                }
                else{
                System.out.print(1);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(5);
    }
    
}

