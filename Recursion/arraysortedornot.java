package Recursion;

import java.util.*;

public class arraysortedornot {
    public static boolean issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int arr1[] = { 1, 2, 3, 4, 2 };
        int arr2[] = { 1, 2, 4, 3, 5 };
        System.out.println("Array1: " + issorted(arr1, i));
        System.out.println("Array2: " + issorted(arr2, i));
    }
}