package Functions;

public class Prime_Range {

    public static boolean prime(int n){
        boolean prime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                prime=false;
                break;
            }
    }
    return prime;
    }

    public static void primesinrange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
            }
            
        }

    public static void main(String[] args) {
        int n=20;
        primesinrange(n);
    }
    
}
