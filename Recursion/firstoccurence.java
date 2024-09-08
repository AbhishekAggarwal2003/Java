package Recursion;

import java.util.*;

public class firstoccurence {
    public static int firstoccurence(int arr[], int i, int e) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == e) {
            return i;
        }
        return firstoccurence(arr, i + 1, e);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int e = 5;
        int arr1[] = { 1, 2, 3, 4, 2, 5, 5, 5 };
        int arr2[] = { 1, 5, 2, 4, 3, 5 };
        System.out.println("Element " + e + " is at: " + firstoccurence(arr1, i, e));
        System.out.println("Element " + e + " is at: " + firstoccurence(arr2, i, e));
    }
}