package Functions;

public class DtoB {

    public static void binary(int n){
        int q=0;
        int r=0;
        int p=1;
        int number=0;
        while(n>0){
            r=n%2;
            number=r*p+number;
            n=n/2;
            p=p*10;
        }
        System.out.print(number);
    }

    public static void main(String[] args) {
        int n=43;
        binary(n);
    }
    
}
