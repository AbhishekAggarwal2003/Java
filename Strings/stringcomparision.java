package Strings;

public class stringcomparision {
    public static void main(String[] args) {
        String s1 = "Abhishek";
        String s2 = "Abhishek";
        String s3 = new String("Abhishek");

        if (s1 == s2) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        if (s1 == s3) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        if (s1.equals(s3)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }
}
