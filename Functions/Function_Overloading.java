package Functions;

//Multiple Functions with same name but different parameters
public class Function_Overloading {

    public static int multiply(int a,int b){
        int prod=a*b;
        return prod;
    }

    public static int multiply(int a,int b,int c){
        int prod=a*b*c;
        return prod;
    }

    public static void main(String[] args) {
        int a=10;
        int b=4;
        int c=34;
        System.out.println(multiply(a,b));
        System.out.println(multiply(a,b,c));
    }
}
