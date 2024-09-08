package Recursion_Part2;

import java.util.Scanner;

public class removingDfromstring {

    public static void remove(String str, int indx, StringBuilder newString, boolean map[]) {
        if (indx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(indx);
        int mapindx = currchar - 'a';

        if (map[mapindx] == true) {
            remove(str, indx + 1, newString, map);
        } else {
            map[mapindx] = true;
            remove(str, indx + 1, newString.append(currchar), map);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        remove(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
