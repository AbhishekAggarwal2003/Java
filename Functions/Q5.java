package Functions;

public class Q5 {
    public static void sum(int n){
        int number=0;
        while(n>0){
            int lastdigit=n%10;
            number=number+lastdigit;
            n=n/10;
        }
        System.out.println(number);
    }
    
    public static void main(String[] args) {
        int n=20903;
        sum(n);
    }
}
