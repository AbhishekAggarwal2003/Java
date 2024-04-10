package Strings;

import java.util.*;

public class printletters {

    public static void printletters(String a) {
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        printletters(Name);
    }
}
