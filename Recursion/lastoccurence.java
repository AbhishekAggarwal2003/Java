package Recursion;

import java.util.*;

public class lastoccurence {
    public static int lastoccurence(int arr[], int i, int e) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoccurence(arr, i + 1, e);
        if (isfound == -1 && arr[i] == e) {
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int e = 5;
        int arr1[] = { 1, 2, 3, 4, 2, 5, 5, 5 };
        int arr2[] = { 1, 5, 2, 4, 3, 5 };
        System.out.println("Element " + e + " is at: " + lastoccurence(arr1, i, e));
        System.out.println("Element " + e + " is at: " + lastoccurence(arr2, i, e));
    }
}