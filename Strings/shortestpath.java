package Strings;

import java.util.*;

public class shortestpath {

    public static float path(String s) {
        int x = 0, y = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'E') {
                x++;
            } else if (s.charAt(i) == 'W') {
                x--;
            } else if (s.charAt(i) == 'N') {
                y++;
            } else {
                y--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        float distance = (float) Math.sqrt(x2 + y2);
        return distance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println(path(s));
    }
}
