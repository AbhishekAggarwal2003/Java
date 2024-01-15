package Functions;

public class Binomial_Cofficient {

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static float BiCoef(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);

        float bicoef=n_fact/(r_fact*nmr_fact);
        return bicoef;
    }

    public static void main(String[] args) {
        int n=68;
        int r=20;
        System.out.println(BiCoef(n, r));
        System.out.println();

    }
}
    
