package Backtracking;

import Recursion_Part2.friendspairing;

public class permutations {

    public static void permutation(String str, String ans) {
        // base
        if (str.length() == 0) {
            System.err.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1, str.length());
            permutation(Newstr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");

    }
}
