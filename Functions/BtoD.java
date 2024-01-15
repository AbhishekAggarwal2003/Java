package Functions;

public class BtoD {

    public static void decimal(int n){
        int power=0;
        double dec=0;
        while(n>0){
            int lastdigit=n%10;
            dec=dec+(lastdigit* (int)Math.pow(2,power));
            power++;
            n=n/10;
        }
        System.out.print(dec);
    }

    public static void main(String[] args) {
        int n=101011;
        decimal(n);
    }
    
}
