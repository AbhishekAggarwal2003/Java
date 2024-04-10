package Strings;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
        String str = "Hello World";
        String str1 = new String(arr);
        System.out.println(str);
        System.out.println(str1);

        // Scanner class
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        System.out.println(str2);

        System.out.println(str1.length()); // length of string

        String firstName = "Abhsiek";
        String lastName = "Aggarwal";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(firstName.charAt(0));
    }
}
